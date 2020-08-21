package spring1;

public class HelloBean {
	
	private String name;
	private String firstName;
	private String lastName;
	
	public HelloBean() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloBean()");
	}
	
	public HelloBean(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("HelloBean(String name)");
		//생성자를 통한 의존성 주입
		this.name = name;
		
	}
	
	public HelloBean(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		System.out.println("HelloBean(String name, String lastName)");
		//생성자를 통한 의존성 주입
		this.firstName = firstName;
		this.lastName = lastName;
				
	}
	
	public void sayHello() {
		System.out.println(this.lastName + " " + this.firstName + " 헬로");
	}

}
