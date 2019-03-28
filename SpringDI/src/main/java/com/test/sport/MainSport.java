package com.test.sport;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainSport {
	public static void main(String[] agrs) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:playerinfo.xml");
		PlayerInfo ppp = ctx.getBean("playerinfo2", PlayerInfo.class);
		System.out.println(ppp.getPlayer().getName());
	}
}
