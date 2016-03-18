package SpringBootMybatis.hellodb.config;

import javax.sql.DataSource;

import org.mybatis.spring.sqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySourrce;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan("SpringBootMybatis.hellodb.mapper")
@PropertySource(value={file:config/datasource.properties})
public class Dataconfig {
	@Value("${jdbc.driver}")
	private String jdbcDriver;

	@Value("${jdbc.url}")
	private String jdbcURL;

	@Value("${jdbc.user}")
	private String jdbcUser;

	@Value("${jdbc.pass}")
	private String jdbcPass;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(jdbcDriver);
		dataSource.setUrl(jdbcURL);
		dataSource.setUsername(jdbcUser);
		dataSource.setPassword(jdbcPass);
		return dataSource;
	}

	@Bean
	public DataSourceTransactionManager transactionManager(){
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlsessionFactoryBean = new SqlSessionFactoryBean();
		sqlsessionFactoryBean.setDataSource(dataSource());
		sqlsessionFactoryBean.setTypeAliasesPackage("SpringBootMybatis.hellodb.model");
		return sqlsessionFactoryBean;
	}

}
