package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CourseApi3Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CourseApi3Application.class, args);
	}
	
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CourseApi3Application.class); 
	} 
	
	
	 @Bean
	 public RestTemplate getRestTemplate() {
	  return new  RestTemplate();
	 }


}
