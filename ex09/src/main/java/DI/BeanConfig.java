package DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.BoardTO;
import spring.WriteAction;

@Configuration
public class BeanConfig {
	@Bean
	public BoardTO boardTO() {
		BoardTO to = new BoardTO();
		to.setSeq(1);
		to.setSubject("제목");
		return to ;
		
	}
	
	@Bean
	public WriteAction writeaction(){
		WriteAction action = new WriteAction();
		action.setBoardTO(boardTO());
		return action;
	}
}
