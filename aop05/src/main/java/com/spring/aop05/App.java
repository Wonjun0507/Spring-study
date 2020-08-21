package com.spring.aop05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import DI.BeanConfig;
import spring.BoardAction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	GenericXmlApplicationContext ctx
//    		= new GenericXmlApplicationContext("classpath:spring/context.xml");
    	
    	AnnotationConfigApplicationContext ctx
    		= new AnnotationConfigApplicationContext(BeanConfig.class);
    
        BoardAction action = (BoardAction)ctx.getBean("action");

        action.execute();
        action.execute1();
        action.execute2();

        ctx.close();
    }
}
