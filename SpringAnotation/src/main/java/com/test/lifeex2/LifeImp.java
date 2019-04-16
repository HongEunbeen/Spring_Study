package com.test.lifeex2;

public class LifeImp implements Lifebean{

	@Override
	public void lifemethod() {
		System.out.println("lifemethod를 구현합니다.");
		
	}
	
	void init() {
		System.out.println("난 빈생성시 꼭 호출되는 메소드당");
	}
	
	void end() {
		System.out.println("난 빈소멸시 꼭 호출되는 메소드당");
	}

}
