package com.test.anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User {
	@Autowired
	@Qualifier("nike");
	
	Shoes shoes;
	
	public String getShoesBrand() {
		return "오늘의 신발은 " + shoes.getBean();
	}
	/*
	 * public Shoes getShoes() { return shoes; }
	 * 
	 * public void setShoes(Shoes shoes) { this.shoes = shoes; }
	 */
}
