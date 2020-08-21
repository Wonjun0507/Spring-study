package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.HelloBean1;
import spring.HelloBean2;

@Configuration
public class BeanConfig {
	
	
	
//	@Bean
//	public HelloBean1 helloBean1() {
//		return new HelloBean1();
//	}
	
	@Bean
	public HelloBean1 helloBean1() {
		// 생성자를 통한 주입
		return new HelloBean1("토르");
	}
	
	@Bean
	public HelloBean2 helloBean2() {
		return new HelloBean2();
	}
	
	@Bean(name = "helloAllBean")
	public HelloBean2 helloBean() {
		return new HelloBean2();
	}
}
