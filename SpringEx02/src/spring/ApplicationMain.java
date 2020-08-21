package spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:spring/context.xml");
		
		// 생성자 한번 호출
		HelloBean helloBean1 = (HelloBean)ctx.getBean("helloBean2");
		HelloBean helloBean2 = (HelloBean)ctx.getBean("helloBean2");
		
		helloBean1.sayHello("토르");
		helloBean2.sayHello("로키");
		
		// 참조값 확인 -> 두 개의 인스턴스
		// prototype은 서로 다른 참조값
		// singleton은 같은 참조값
		System.out.println(helloBean1);
		System.out.println(helloBean2);
	}

}
