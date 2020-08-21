package com.exam.spring1;

public class HelloBean {
	
	// 깃허브 올리는 실험중
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
		System.out.println("[ helloBean1 ] " + this.name);
		System.out.println("[ helloBean2 ] " + this.lastName + " " + this.firstName + " 헬로");
	}

}
