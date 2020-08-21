package spring2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ApplicationMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx
			= new GenericXmlApplicationContext("classpath:spring2/context.xml");
		
		WriteAction action =(WriteAction)ctx.getBean("action");
		action.excute();
		
		ctx.close();

	}

}
