package com.test.diEx2;

public class ExDao {
	String msg;
	public ExDao() {
		
	}
	public ExDao(String msg) {
		this.msg = msg;	
	}
	void output() {
		System.out.println("메세지: " + msg);
	}
}
