package com.test.lifeex11;

public class LifeImp implements Life{
	String beanname;
	@Override
	public void lifemethod() {
		System.out.println("lifemethod를 구현합니다.");
	}
	void start() {
		System.out.println("난 start메소드입니다. 여기서 초기화 가능 합니다.");
	}
	void end() {
		System.out.println();
	}
	public String getBeanname() {
		return beanname;
	}
	public void setBeanname(String beanname) {
		this.beanname = beanname;
	}

}
