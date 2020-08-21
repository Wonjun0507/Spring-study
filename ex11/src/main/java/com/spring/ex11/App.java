package com.spring.ex11;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.BoardAction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:spring/context.xml");

		
// 		BoardAction action = (BoardAction) ctx.getBean("action");
		BoardAction action = ctx.getBean("action", BoardAction.class);
		action.execute();
		ctx.close();
	}
}
