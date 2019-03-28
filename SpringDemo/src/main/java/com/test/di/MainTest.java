package com.test.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:test.xml");
		
		TestDAO tdao = ctx.getBean("testDaoImp", TestDAOImp.class);
		tdao.printMsg();		
		
	}

}
