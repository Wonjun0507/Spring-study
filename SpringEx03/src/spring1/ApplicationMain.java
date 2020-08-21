package spring1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx
			= new GenericXmlApplicationContext("classpath:spring/context.xml");
		
		//											  context의 id 부분
		HelloBean helloBean2 = (HelloBean)ctx.getBean("helloBean2");
		helloBean2.sayHello();
		
		HelloBean helloBean3 = (HelloBean)ctx.getBean("helloBean3");
		helloBean3.sayHello();

	}

}
