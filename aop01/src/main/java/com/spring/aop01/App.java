package com.spring.aop01;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.BoardAction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GenericXmlApplicationContext ctx
        	= new GenericXmlApplicationContext("classpath:spring/context.xml");
        
//      BoardAction action = (BoardAction)ctx.getBean("action");
        // proxy : context의 AOP를 적용하여 핵심기능과 공통기능을 실행시킴
        BoardAction action = (BoardAction)ctx.getBean("proxy");
        action.execute();
        action.execute1();
        action.execute2();
        
        ctx.close();
    }
}
