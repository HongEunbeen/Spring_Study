package com.test.TVproj;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainTv {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:tv.xml");
		
		Tv tv3 = ctx.getBean("lgtv",LgTv.class);
		tv3.pweron();
		/*
		 * Tv tv = ctx.getBean("tv",SamsungTv.class);
		 * System.out.println("tv________________"); tv.pweron(); tv.poweroff();
		 * tv.volumnup(); tv.volumdown();
		 * 
		 * System.out.println("tv1________________"); Tv tv1 =
		 * ctx.getBean("tv1",SamsungTv.class); tv1.pweron(); tv1.poweroff();
		 * tv1.volumnup(); tv1.volumdown();
		 * 
		 * 
		 * System.out.println("tv2________________"); Tv tv2 =
		 * ctx.getBean("tv2",SamsungTv.class); tv2.pweron(); tv2.poweroff();
		 * tv2.volumnup(); tv2.volumdown();
		 */
		
		
	}

}