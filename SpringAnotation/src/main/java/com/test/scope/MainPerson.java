package com.test.scope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainPerson {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:person.xml");
		
		Person person1 = ctx.getBean("person1",Person.class);
		System.out.println("name: "+person1.getName());
		System.out.println("age: "+person1.getAge());
		
		Person person2 = ctx.getBean("person1",Person.class);
		person2.setName("차차차");
		System.out.println("name: "+person2.getName());
		System.out.println("age: "+person2.getAge());
		System.out.println("-------------------------------");
		System.out.println("person1 주소는 -> "+person1);
		System.out.println("person2 주소는 -> "+person2);

	}

}
