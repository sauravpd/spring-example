package spring_example.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_example.config.AppConfig;
import spring_example.service.CustomerService;

public class Application 
{
	public static void main(String[] args) 
	{
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service=appContext.getBean("customerService",CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstName());
		((ConfigurableApplicationContext)appContext).close();
	}
}
