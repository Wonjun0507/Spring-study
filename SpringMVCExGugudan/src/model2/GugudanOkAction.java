package model2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// ListAction / WriteAction과 같은 구조
// Controller는 BoardAction(interface) 역할
public class GugudanOkAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("GugudanOkAction() 호출");

		System.out.println(arg0.getParameter("data1"));
		System.out.println(arg0.getParameter("data2"));
				
		ModelAndView modelAndView = new ModelAndView();
		// 						 dispatcher-servlet.xml의 value 값
		modelAndView.setViewName("gugudan_ok");
		
		modelAndView.addObject("data11", arg0.getParameter("data1"));
		modelAndView.addObject("data21", arg0.getParameter("data2"));
		
		return modelAndView;
	}
	
	

}
