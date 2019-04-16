package com.test.lifeex1;
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
	
	@PostConstruct
	void init() { // 맘대로 함수이름을 지정할 수 있다. 빈을 만들때 초기화할 내용을 적어주면 된다. 
		System.out.println("생성시 내가 호출되지롱");
	}
	
	@PreDestroy
	void end() { //맘대로 소멸시 처리할 로직이 있으면 이곳에 적는다.
		System.out.println("소멸시 내가 호출되지롱");
	}
}
