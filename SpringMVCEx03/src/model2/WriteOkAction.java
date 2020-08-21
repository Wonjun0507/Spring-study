package model2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// ListAction / WriteAction과 같은 구조
// Controller는 BoardAction(interface) 역할
public class WriteOkAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WriteOkAction() 호출");
		
		// 아래 방법보다 filter방법이 더 낫다.
		// arg0.setCharacterEncoding("utf-8");
		
		System.out.println(arg0.getParameter("data"));
				
		ModelAndView modelAndView = new ModelAndView();
		// 						 dispatcher-servlet.xml의 value 값
		modelAndView.setViewName("write_ok");
		
//		arg0.setAttribute("data", arg0.getParameter("data"));
		modelAndView.addObject("data", arg0.getParameter("data"));
		
		return modelAndView;
	}
	
	

}
