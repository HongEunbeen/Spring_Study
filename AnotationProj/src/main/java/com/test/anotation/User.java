package com.test.anotation;

public class User {
	Shoes shoes;

	public String getShoesBrand() {
		return "오늘의 신발은 " + shoes.getBean();
	}
	public Shoes getShoes() {
		return shoes;
	}

	public void setShoes(Shoes shoes) {
		this.shoes = shoes;
	}
}
