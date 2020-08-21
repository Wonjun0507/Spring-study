package spring;

public class HelloBean {
	// 문자열(Object .. ) - 클래스이다
	// 내부적인 클래스를 인스턴스화 하는것이 의존성 주입이다(?)
	private String name;
	
	public HelloBean() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloBean() 호출");
		this.name = "로키";
	}
	
	public HelloBean(String name) {
		// TODO Auto-generated method stub
		System.out.println("HelloBean(String name) 호출");
		this.name = name;

	}
	
	public void sayHello() {
		System.out.println(this.name + " 헬로");
	}

}
