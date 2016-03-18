package SpringBootMybatis.hellodb.mapper;

import java.util.List;
import SpringBootMybatis.hellodb.model.Testimp;

public interface TestimpMapper {
	Testimp getTestimpById(int id);

	List<Testimp> getALLTestimp();

	int deleteTestimpById(int id);

	int insertTestimp(Testimp testimp);

	int updateTestimp(Testimp testimp);
}
