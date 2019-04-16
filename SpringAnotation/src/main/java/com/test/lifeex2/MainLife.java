package com.test.lifeex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainLife {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:life.xml");
		LifeImp life1 = ctx.getBean("lifebean", LifeImp.class);
		//life1.
		ctx.close(); 

	}

}
