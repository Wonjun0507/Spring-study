package polySpring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ApplicationMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// run 하면 생성자를 미리 호출하게됨
//		GenericXmlApplicationContext ctx
//		= new GenericXmlApplicationContext("classpath:polySpring/context.xml");
		
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext();
		ctx.load("classpath:polySpring/context.xml");
		ctx.refresh();
		
		// 인터페이스(Hello) 이용
		Hello helloBean1 = (Hello)ctx.getBean("helloBean1");
		helloBean1.sayHello("토르");
		
		// 당연히 인터페이스 없이도 가능
		HelloBean2 helloBean2 = (HelloBean2)ctx.getBean("helloBean2");
		helloBean2.sayHello("로키");
		
		ctx.close();

	}

}
