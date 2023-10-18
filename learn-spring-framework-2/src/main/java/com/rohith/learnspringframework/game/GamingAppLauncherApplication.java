package com.rohith.learnspringframework.game;

import java.text.Annotation;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Configuration
@ComponentScan("com.rohith.learnspringframework.game")
public class GamingAppLauncherApplication {
	


	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} 
		}
	}
 