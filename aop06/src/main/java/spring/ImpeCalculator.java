package spring;

public class ImpeCalculator implements Calculator {
	
	public long factorial(long num) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		long result = 1;
		for(int i=1; i<=num; i++) {
			result *=i;
		}
		long end = System.currentTimeMillis();
		System.out.printf("ImpeCalculator.factorial(%d) 실행 시간 = %d\n", num, (end-start));

		return result;
	}

}


