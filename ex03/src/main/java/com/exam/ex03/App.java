package com.exam.ex03;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.BoardTO;
import spring.WriteAction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// 스프링으로 처리 가능
    	
    	GenericXmlApplicationContext ctx 
    		= new GenericXmlApplicationContext("classpath:spring/context.xml");
    	
    	// 1번
    	WriteAction writeAction = (WriteAction)ctx.getBean("action");
    	writeAction.execute();
    	
//        BoardTO to = new BoardTO();
//        to.setSeq(1);
//        to.setSubject("제목");
        
//        WriteAction writeAction = new WriteAction();
//        writeAction.setTo(to);
        
        
        
        
    	// 2번
    	BoardTO to = (BoardTO)ctx.getBean("to");
    	
    	System.out.println("seq : " + to.getSeq());
    	System.out.println("subject : " + to.getSubject());
    }
}
