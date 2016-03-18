package SpringBootMybatis.hellodb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SpringBootMybatis.hellodb.model.Testimp;
import SpringBootMybatis.hellodb.service.TestimpService;
import SpringBootMybatis.hellodb.util.ReqRespUtil;

@RestController
@RequestMapping("/testimp")
public class TestimpController {
	@Autowired
	TestimpService testimpService;

	@RequestMapping(value = "/get/{word_id}", method = Request.GET)
	public Object getTestimpById(HttpServletRequest request, @PathVarible("world_id") int id){
		return ReqRespUtil.makeOKResp(request, testimpService.geTestById(id));
	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public Object getALLTestimp(HttpServletRequest request) {
		return ReqRestUtil.makeOKResp(request, testimpService.getALLTestimp());
	}

	@RequestMapping(value="/insert", method = RequestMethod.POST)
	public Object insertTestimp(@RequestBody @Valid Testimp testimp, HttpServletRequest request){
		return ReqRespUtil.makeOKResp(request, testimpService.insertTestimp(testimp));
	}

	@RequestMapping(value="/update", method = RequestMethod.POST)
	public Object updateTestimp(@RequestBody @Valid Testimp testimp, HttpServletRequest request){
		return ReqRespUtil.makeOKResp(request, testimpService.updateTestimp(testimp));
	}
	
	@RequestMapping(value="/delete/{word_id}", method = RequestMethod.GET)
	public Object insertTestimp(HttpServletRequest request, @PathVarible("word_id") int id){
		return ReqRespUtil.makeOKResp(request, testimpService.deleteTestimpById(id));
	}
}
