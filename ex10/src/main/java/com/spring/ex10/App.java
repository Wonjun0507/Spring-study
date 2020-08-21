package com.spring.ex10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import DI.BeanConfig1;
import DI.BeanConfig2;
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
        AnnotationConfigApplicationContext ctx
        = new AnnotationConfigApplicationContext(BeanConfig1.class
        		,BeanConfig2.class);
        
        HelloBean1 helloBean1 = (HelloBean1)ctx.getBean("helloBean1");
        HelloBean2 helloBean2 = (HelloBean2)ctx.getBean("helloBean2");
        
        helloBean1.sayHello("행덕자");
        helloBean2.sayHello("고길동");
        
        ctx.close();
        
        
    }
}
