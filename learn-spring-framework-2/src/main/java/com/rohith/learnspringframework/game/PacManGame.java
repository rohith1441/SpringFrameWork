package com.rohith.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.joran.action.ActionUtil.Scope;

@Component()
public class PacManGame implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("UP");
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("DOWN");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("LEFT");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("RIGHT");
	}

}
