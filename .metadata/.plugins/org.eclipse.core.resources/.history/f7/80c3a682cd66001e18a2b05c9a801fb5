package com.rohith.learnspringframework;

import java.text.Annotation;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rohith.learnspringframework.game.GameRunner;
import com.rohith.learnspringframework.game.GamingConsole;
import com.rohith.learnspringframework.game.MarioGame;
import com.rohith.learnspringframework.game.PacManGame;
import com.rohith.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			
			e.printStackTrace();
		}
	}

}
 