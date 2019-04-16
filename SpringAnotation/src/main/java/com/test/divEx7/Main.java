package com.test.divEx7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Player p1 = ctx.getBean("player1", Player.class);
		System.out.println("p1.name:" + p1.getName());
		System.out.println("p1.age:" + p1.getAge());
		System.out.println("p1.position:" + p1.getPosition());
		System.out.println("p1.height:" + p1.getHeight());
		System.out.println("p1.weight:" + p1.getWeight());
		System.out.println("=================================================");
		Player p2 = ctx.getBean("player2", Player.class);
		System.out.println("p2.name:" + p2.getName());
		System.out.println("p2.age:" + p2.getAge());
		System.out.println("p2.position:" + p2.getPosition());
		System.out.println("p2.height:" + p2.getHeight());
		System.out.println("p2.weight:" + p2.getWeight());
	}

}
