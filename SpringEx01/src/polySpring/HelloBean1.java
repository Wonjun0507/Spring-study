package polySpring;

public class HelloBean1 implements Hello {

	public HelloBean1() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloBean1()");
	}
	
	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "형님 헬로");
	}


}
