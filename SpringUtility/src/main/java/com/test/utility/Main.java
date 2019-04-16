package com.test.utility;

import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main{

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:setutil.xml");
		
		Collection setbean = (Collection) ctx.getBean("setdata1");
		CollectionMap mapbean = (CollectionMap)ctx.getBean("mapdata1");
		
		Set<String> addr = setbean.getAddress();
		Map<String,String> dinner = mapbean.getMapdinner();
		
		for(String address:addr) {
			System.out.println(address.toString());
		}
		for(String key:dinner.keySet()) {
			System.out.println(String.format("%s, %s",key, dinner.get(key)));
		}
		
		ctx.close();
	}

}