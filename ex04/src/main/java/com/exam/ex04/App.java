package com.exam.ex04;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.BoardListTO;
import spring.BoardTO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// 여기부터
//        ArrayList<String> userLists = new ArrayList<String>();
//        userLists.add("토르");
//        userLists.add("로키");
//        
//        BoardListTO listTO = new BoardListTO();
//        listTO.setUserLists(userLists);
        // 여기까지 스프링으로 바꾼다
    	
    	GenericXmlApplicationContext ctx
    		= new GenericXmlApplicationContext("classpath:spring/context.xml");
    	
    	BoardListTO listTO = (BoardListTO)ctx.getBean("listTO");
    	
        
        for(String user : listTO.getUserLists()) {
        	System.out.println("user : " + user);
        }
        
       
        // 여기부터
//        BoardTO to1 = new BoardTO();
//        to1.setSeq(1);
//        to1.setSubject("제목 1");
//        
//        BoardTO to2 = new BoardTO();
//        to2.setSeq(2);
//        to2.setSubject("제목 2");
//        
//        ArrayList<BoardTO> boardLists = new ArrayList<BoardTO>();
//        boardLists.add(to1);
//        boardLists.add(to2);
        // 여기까지 스프링으로 바꾼다
        
//        ArrayList<BoardTO> boardLists1 = (ArrayList<BoardTO>)ctx.getBean("listTO"); 
        
        for(BoardTO to : listTO.getBoardLists()) {
        	System.out.println("seq1 : " + to.getSeq());
        	System.out.println("subject1 : " + to.getSubject());
        }
        
        for(BoardTO to : listTO.getBoardSets()) {
        	System.out.println("seq2 : " + to.getSeq());
        	System.out.println("subject2 : " + to.getSubject());
        }
        
        for(BoardTO to : listTO.getBoardMaps().values()) {
        	System.out.println("seq3 : " + to.getSeq());
        	System.out.println("subject3 : " + to.getSubject());
        }
        
    }
}








