package com.rohith.learnspringframework.game.examples.f1;

import java.text.Annotation;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.rohith.learnspringframework.game.examples.a1.DependencyInjectionLauncherApplication;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass
{
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency =someDependency;
		System.out.println("All Dependencies are ready");
	}
	@PostConstruct
	public void initlization() {
		someDependency.getReady();
	
	}
	
	@PreDestroy
	private void cleanup()
	{	
		System.out.println("CleanUp0");
	}
	
	}


@Component
class SomeDependency{

	public void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Some logic from dependency");
		
	}
}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
	


	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
			for(String string: context.getBeanDefinitionNames()) {System.out.println(string);}
		} 
		}
	}
  