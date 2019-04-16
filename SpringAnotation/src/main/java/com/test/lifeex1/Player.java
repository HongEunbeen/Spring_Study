package com.test.lifeex1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Player implements InitializingBean, DisposableBean {
	String name;
	int age;
	
	public Player() {}
	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
//		System.out.println("afterPropertiesSet() 빈생성시 반드시 구현할 메소드입니다.");
//		System.out.println("이 클래스에서 생성된 객체는 야구선수에 대한 이름과 나이가 관리됩니다.");
		if(age<=0 || age>140) {
			System.out.println("age는 1세에서 140이하여야 합니다.");
		}	
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("소멸시 호출되는 메소드입니다");
		
	}
	
	
}
