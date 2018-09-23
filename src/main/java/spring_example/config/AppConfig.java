package spring_example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * App Configuration  
 * @author saurav
 *
 */
@Configuration
@ComponentScan({"spring_example"})
@PropertySource("app.properties")
public class AppConfig 
{

	@Bean
	public PropertySourcesPlaceholderConfigurer getProperty() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
