package com.rohith.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Up");
	}
	public void down() {
		System.out.println("sit down");
	}
	public void left() {
		System.out.println("Go Left");
	}
	public void right() {
		System.out.println("Shoot");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Super Contra Game";
	}

}
