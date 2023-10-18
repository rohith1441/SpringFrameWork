package com.rohith.learnspringframework.game.examples.g1;

import java.text.Annotation;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.rohith.learnspringframework.game.examples.a1.DependencyInjectionLauncherApplication;

import jakarta.inject.Inject;
import jakarta.inject.Named;



//@Component
@Named
class BusinessService{
	private Dataservice dataService;
	
	
	public Dataservice getDataService() {
		
		return dataService;
		
	}
	//@Autowired
	@Inject
	public void setDataService(Dataservice dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}
}

//@Component
@Named
class Dataservice{
	
}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {
	


	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {
			for(String string: context.getBeanDefinitionNames()) {System.out.println(string);}
			System.out.println(context.getBean(BusinessService.class).getDataService());
		} 
		}
	}
 