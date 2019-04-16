package com.test.lifeex11;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainLifeTest {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new GenericXmlApplicationContext("classpath:life11.xml");
		LifeImp obj1=ctx.getBean("lifeb",LifeImp.class);
		
		Player2 obj2 = ctx.getBean("fighter1", Player2.class);
		
		System.out.println(obj2.getAge() + "," + obj2.getName());
		
		obj1.setBeanname("생명주기 실습중");
		System.out.println("obj1.beanname ="+obj1.getBeanname());
		ctx.close();
	}
}