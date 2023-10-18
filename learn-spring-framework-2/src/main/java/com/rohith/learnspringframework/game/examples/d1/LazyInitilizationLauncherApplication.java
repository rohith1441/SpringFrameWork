package com.rohith.learnspringframework.game.examples.d1;

import java.text.Annotation;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA{
	
}


@Component
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("some initilization logic");
		this.classA =classA;
	}
	
	public void doSomething() {
		System.out.println("Do something");
	}
}


@Configuration
@ComponentScan
public class LazyInitilizationLauncherApplication {
	


	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(LazyInitilizationLauncherApplication.class)) {
			System.out.println("Initliation of context is completed");
			context.getBean(ClassB.class).doSomething();
		} 
		}
	}
 