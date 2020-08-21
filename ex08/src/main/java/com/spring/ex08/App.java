package com.spring.ex08;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.BeanConfig;
import spring.Hello;
import spring.HelloBean1;
import spring.HelloBean2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// 동적 클래스 로딩
        AnnotationConfigApplicationContext ctx
        	= new AnnotationConfigApplicationContext( BeanConfig.class);
        
        HelloBean1 helloBean1 = (HelloBean1)ctx.getBean("helloBean1");
        //helloBean1.sayHello("토르");
        helloBean1.sayHello();
        
        // interface
        Hello hello1 = (Hello)ctx.getBean("helloBean1");
        hello1.sayHello("토르");
        
        HelloBean2 helloBean2 = (HelloBean2)ctx.getBean("helloBean2");
        helloBean2.sayHello("로키");
        
        Hello hello2 = (Hello)ctx.getBean("helloBean2");
        hello2.sayHello("로키");
        
        // 주의 : helloBean이 아니라 새로 설정한 name="helloAllBean" 사용함
        Hello hello3 = (Hello)ctx.getBean("helloAllBean");
        hello3.sayHello("헐크");
        
        ctx.close();
        
    }
}
