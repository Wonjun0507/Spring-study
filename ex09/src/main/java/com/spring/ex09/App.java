package com.spring.ex09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import DI.BeanConfig;
import spring.BoardTO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext ctx
       = new AnnotationConfigApplicationContext(BeanConfig.class);
       
       BoardTO to = (BoardTO)ctx.getBean("boardTO");
       System.out.println(to.getSeq());
       System.out.println(to.getSubject());
       
       ctx.close();
    }
}
