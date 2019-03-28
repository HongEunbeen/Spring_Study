package com.test.diEx1;

public class MyGetsum { //MyGetsum클래스는 Getsum클래스에 의존한다
	Getsum getsum;
	int a;
	int b;
	void sum() {
		getsum.sum(a, b);
	}
	public Getsum getGetsum() {
		return getsum;
	}
	public void setGetsum(Getsum getsum) {
		this.getsum = getsum;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
