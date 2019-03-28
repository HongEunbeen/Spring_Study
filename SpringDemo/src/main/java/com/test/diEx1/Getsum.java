package com.test.diEx1;

public class Getsum {
	private int aa;
	private int bb;
	public void sum(int aa, int bb) {
		int result = aa+bb;
		System.out.println("sum:" + result);
	}
	public int getAa() {
		return aa;
	}
	public void setAa(int aa) {
		this.aa = aa;
	}
	public int getBb() {
		return bb;
	}
	public void setBb(int bb) {
		this.bb = bb;
	}
	
}
