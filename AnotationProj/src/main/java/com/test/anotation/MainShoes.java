package com.test.anotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainShoes {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:shoes.xml");
		
		User userme = ctx.getBean("me", User.class);
		System.out.println("userme:" + userme.getShoesBrand());
	}

}
