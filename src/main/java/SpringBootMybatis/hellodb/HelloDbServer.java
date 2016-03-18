package SpringBootMybatis.hellodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration

public class HelloDbServer extends SpringBootServletInitiallizer {
	public static void main(String args[]){
		SpringApplication.run(HelloDbServer.class, args);
	}

	@Override
	protected final SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
	return applicationBuilder.sources(HelloDbServer.class);
	}
}
