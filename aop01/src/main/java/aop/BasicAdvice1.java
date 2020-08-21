package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class BasicAdvice1 implements MethodInterceptor {
	
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		//Around Advice
		
		System.out.println("[ 전처리 ]");
		

		String methodName = invocation.getMethod().getName();
		System.out.println("advice1 시작 : " + methodName);
		
		// 스탑워치 메서드
		StopWatch stopWatch = new StopWatch();
		stopWatch.start(methodName);
		
		// 핵심 실행
		Object rtnObj = invocation.proceed();
		
		stopWatch.stop();
		
		System.out.println("advice1 끝 : " + (stopWatch.getTotalTimeSeconds() + " 초"));
		
		System.out.println("[ 후처리 ]");
		
		return rtnObj;
	}

}
