package com.test.diEx2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:exdao.xml");
		
		ExDao ex = ctx.getBean("exdao",ExDao.class);
		ex.output();
	}

}
