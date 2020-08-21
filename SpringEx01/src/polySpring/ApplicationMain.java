package polySpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx
		= new ClassPathXmlApplicationContext("classpath:polySpring/context.xml");
		
		
		// 인터페이스(Hello) 이용
		Hello helloBean1 = (Hello)ctx.getBean("helloBean1");
		helloBean1.sayHello("토르");
		
		// 당연히 인터페이스 없이도 가능
		HelloBean2 helloBean2 = (HelloBean2)ctx.getBean("helloBean2");
		helloBean2.sayHello("로키");
		
		
	}

}
