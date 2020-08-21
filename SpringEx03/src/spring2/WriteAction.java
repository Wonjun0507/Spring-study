package spring2;

public class WriteAction {
	
	private BoardTO to;
	
	public WriteAction() {
		// TODO Auto-generated constructor stub
		System.out.println("WriteAction() 호출");
	}
	
	public WriteAction(BoardTO to) {
		System.out.println("WriteAction(BoardTO to) 호출");
		this.to = to;
	}
	
	public void excute() {
		System.out.println("execute() 호출");
	}

}
