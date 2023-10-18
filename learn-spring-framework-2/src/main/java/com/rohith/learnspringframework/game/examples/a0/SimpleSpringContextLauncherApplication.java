package com.rohith.learnspringframework.game.examples.a0;

import java.text.Annotation;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.rohith.learnspringframework.game.examples.a1.DependencyInjectionLauncherApplication;



@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
	


	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {
			for(String string: context.getBeanDefinitionNames()) {System.out.println(string);}
		} 
		}
	}
 