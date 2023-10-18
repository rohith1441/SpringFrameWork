package com.rohith.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1. Launch a Spring Context
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		
		//2. configure the things we want Spring to manage= @Configuration
		//HelloWorldConfiguration - @Configuration
		//name- @Bean
		
		//3. Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person5Qualifier"));
		//for(String string:context.getBeanDefinitionNames()) {
			//System.out.println(string);
		//}
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);{}
		
		}
} 
}
 