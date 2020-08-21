package spring;

public class HelloBean2 implements Hello {
	
	public HelloBean2() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloBean2() 호출");
	}
	
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 바이");
	}

}
