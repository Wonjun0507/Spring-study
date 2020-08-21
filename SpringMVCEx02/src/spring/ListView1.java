package spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// ListAction / WriteAction과 같은 구조
// Controller는 BoardAction(interface) 역할
public class ListView1 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ListView1() 호출");
		
		ModelAndView modelAndView = new ModelAndView();
		// 						 dispatcher-servlet.xml의 value 값
		modelAndView.setViewName("listview1");
		
		return modelAndView;
	}
	
	

}
