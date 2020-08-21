package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BasicAdvice {

	// context.xml의 pointcut 부분
	@Pointcut("execution(* execute1())")
	private void myTarget() {}
	
	// Pointcut 애노테이션을 참조하여 사용
	@Around("myTarget()")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("[ 전처리 ]");
		
		Object rtnObj = joinPoint.proceed();
		
		System.out.println("[ 후처리 ]");
		
		return rtnObj;
		
	}
	
	@Before("execution(* execute())")
	public void before() throws Throwable {
		
		System.out.println("[ before() ] 실행");
		
	}
	
	@After("execution(* execute2())")
	public void after() throws Throwable {
		
		System.out.println("[ after() ] 실행");
		
	}
	

}
