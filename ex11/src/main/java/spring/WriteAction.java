package spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class WriteAction implements BoardAction, ApplicationContextAware, BeanFactoryAware, BeanNameAware,
		DisposableBean, InitializingBean {
	private String writer;
	private String beanName;
	private BeanFactory beanFactory;
	
	

	public WriteAction() {

		System.out.println("1.빈의 생성자 실행");
	}

	public void setWriter(String writer) {
		System.out.println("2.public void setWriter(String writer)");
		this.writer = writer;
	}

	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("execute()실행");
		
		System.out.println("beanName:"+beanName);
		System.out.println("beanfactory:"+beanFactory);
		
		System.out.println("writer:" + this.writer);
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("7.afterPropertiesSet(실행)");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("10.destroy()");
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("3.setBeanName");
		
		this.beanName = name;
		
		System.out.println("beanName:"+beanName);
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("4.setBeanFactory");
		
		this.beanFactory = beanFactory;
		System.out.println("beanfactory"+beanFactory);
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("5.setApplicationContext");
	}

}
