package com.example.spring2findmax;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.spring2findmax.data.DataService;
import com.example.spring2findmax.data.CalculationService;

@Configuration
@ComponentScan("com.example.spring2findmax.data")

public class AppLauncher {
	
	DataService dataService;
	
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppLauncher.class)) {
			
			//get all beans
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			int max = (int)context.getBean(CalculationService.class).findMax();
			System.out.println(max);
			
		}
		
		
		
	}

}
