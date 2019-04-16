package com.test.lifeex1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Mainlifeex1 {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:baseball.xml"); //load메소드가 bean공장을 불러준다.
		ctx.refresh(); //빈생성 --> 초기값으로 지정할 함수를 불러준다.
		
		
		ctx.close();//빈 소멸시킴 --> 소멸시 처리할 작업이 있다면 그 함수를 호출해준다. 

	}

}
