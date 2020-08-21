package spring2;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardTO to = new BoardTO();
		WriteAction action =new WriteAction(to);
		
		action.excute();
		

	}

}
