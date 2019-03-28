package com.spring.person;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:person.xml");
		PersonInfo personinfo1 = ctx.getBean("personinfo", PersonInfo.class);
		personinfo1.printAll();
		/*
		 PersonInfo person1 = new PersonInfo(new Person("채수연", "22", "dutjd","010328-41046923")); PersonInfo pi1 = new PersonInfo(); person1.printAll();
		 */
	}

}
