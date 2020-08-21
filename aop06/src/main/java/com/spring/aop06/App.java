package com.spring.aop06;

import spring.ExeTimeCalculator;
import spring.ImpeCalculator;
import spring.RecCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
        System.out.println("ttCal1.factorial(20) : " + ttCal1.factorial(20));
        
        ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
        System.out.println("ttCal2.factorial(20) : " + ttCal2.factorial(20));
    }
}
