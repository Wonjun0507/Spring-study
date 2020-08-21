package DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aop.BasicAdvice;
import spring.WriteAction;

@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {

	@Bean
	public WriteAction action() {
		WriteAction action = new WriteAction();
		action.setWriter("토르");
		return action;
	}
	
	public BasicAdvice basicAdvice() {
		return new BasicAdvice();
	}

}
