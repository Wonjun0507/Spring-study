package com.exam.ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.BoardTO;

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
        
        BoardTO to = (BoardTO)ctx.getBean("to2");
        
        System.out.println("seq : " + to.getSeq());
        System.out.println("subject : " + to.getSubject());
        
        ctx.close();
    }
}
