package com.test.lifeex11;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.*;

public class Player2 {
	String name;
	int age;
	
	public Player2() {}
	public Player2(String name, int age) {
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
	
	@PostConstruct
	public void chogiwha() {
		System.out.println("--------------------------------------");
		System.out.println("annotation을 이용한 초기화");
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("--------------------------------------");
		System.out.println("annotation을 이용한 종료");
		
	}
	
	
}
