package spring;

public class ExeTimeCalculator implements Calculator {
	
	private Calculator delegate;
	
	public ExeTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}

	public long factorial(long num) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		System.out.printf("%s.factorial(%d) 실행 시간 = %d\n", 
				delegate.getClass().getSimpleName(), 
				num, (end - start));
		
		return result;
	}
	
	

}
