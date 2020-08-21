package com.exam.ex05;

import java.util.Properties;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.BookClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// 여기부터
//        Properties config = new Properties();
//        config.put("server", "192.168.0.100");
//        config.put("connectionTimeout", "5000");
//        
//        BookClient client = new BookClient();
//        client.setConfig(config);
        // 여기까지 스프링으로 바꾼다.
    	
    	GenericXmlApplicationContext ctx 
    		= new GenericXmlApplicationContext("classpath:spring/context.xml");
    	
    	BookClient client = (BookClient)ctx.getBean("client");
    	        
        Properties newConfig = client.getConfig();
        System.out.println(newConfig.getProperty("server"));
        System.out.println(newConfig.getProperty("connectionTimeout"));
    }
}
