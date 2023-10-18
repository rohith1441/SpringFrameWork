package com.rohith.learnspringframework.game;

public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Get into a hole");
	}
	public void left() {
		System.out.println("Go Left");
	}
	public void right() {
		System.out.println("Accelerate");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mario Game";
	}
	

}
