package com.test.TVproj;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker {
	SonySpeaker(){
		System.out.println("sonyspeaker---> 객체가 생성성공");
	}
	public void volumeup() {
		System.out.println("sonyspeaker volume up");
	}
}
