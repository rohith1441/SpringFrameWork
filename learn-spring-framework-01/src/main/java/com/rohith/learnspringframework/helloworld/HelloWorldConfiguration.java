package com.rohith.learnspringframework.helloworld;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String firstLine, String city) {}
record Person(String name, int age, Address address) {}

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Rohith";
	}
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person()
	{
		return  new Person("Vivek", 13, new Address("Main Street", "Utrecht"));
		
	}
	
	
	@Bean
	public Person person2MethodCall()
	{
		var person = new Person(name(), age(),address());
		return person;
	}
	
	@Bean
	public Person person3Parameters(String name,int age, Address address3)
	{//name, age, address2
		var person = new Person(name, age,address3);
		return person;
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name,int age, Address address)
	{//name, age, address2
		var person = new Person(name, age,address);
		return person;
	}
	
	@Bean
	
	public Person person5Qualifier(String name,int age,@Qualifier("address3qualifier") Address address)
	{//name, age, address2
		var person = new Person(name, age,address);
		return person;
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Baker Street", "London");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Huntsville", "USA");
	}
	}

