package spring;

public class HelloBean1 implements Hello {
	
	private String name;
	
	public HelloBean1() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloBean1() 호출");
	
	}
	
	public HelloBean1(String name) {
		System.out.println("HelloBean1() 호출");
		this.name = name;
	}
	
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(name + " 헬로");
	}
	
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 헬로");
	}
	


}
