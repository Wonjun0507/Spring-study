package com.exam.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.exam.spring1.HelloBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	GenericXmlApplicationContext ctx
    		= new GenericXmlApplicationContext("classpath:com/exam/spring1/context.xml");
    	
    	HelloBean helloBean1 = (HelloBean)ctx.getBean("helloBean1");
    	helloBean1.sayHello();
    	
    	HelloBean helloBean2 = (HelloBean)ctx.getBean("helloBean2");
    	helloBean2.sayHello();
    	
        System.out.println( "Hello World!" );
    }
}
