package spring;

public class WriteAction implements BoardAction {
	
	private String writer;

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("헬로 : " + writer);
		
		int sum = 0;
		for(int i=1; i<=10000; i++) {
			sum += i;
		}
		
		System.out.println("메서드 종료");
		
	}
	
	public void execute1() {
		// TODO Auto-generated method stub
		System.out.println("execute1() 헬로 : " + writer);
		

		System.out.println("execute1() 메서드 종료");
		
	}
	
	public void execute2() {
		// TODO Auto-generated method stub
		System.out.println("execute2() 헬로 : " + writer);
		

		System.out.println("execute2() 메서드 종료");
		
	}
}
