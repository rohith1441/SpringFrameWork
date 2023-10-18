package com.rohith.learnspringframework.game.examples.a1;

import java.text.Annotation;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class YourBusinessClass{
	
	Dependency1 dependency1;
	
	Dependency2 dependency2;
	

	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor injection - Your Business class");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}



	/*
	 * @Autowired public void setDependency1(Dependency1 dependency1) {
	 * System.out.println("Setter injection - setDependency1"); this.dependency1 =
	 * dependency1; }
	 * 
	 * @Autowired public void setDependency2(Dependency2 dependency2) {
	 * System.out.println("Setter injection - setDependency1"); this.dependency2 =
	 * dependency2; }
	 * 
	 */

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Using " + dependency1 +"and " +dependency2 ;
	}
	
}

@Component
class Dependency1{
	
}

@Component
class Dependency2
{
	}



@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
	


	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {
			for(String string: context.getBeanDefinitionNames()) {System.out.println(string);}
			System.out.println(context.getBean(YourBusinessClass.class));
		} 
		}
	}
 