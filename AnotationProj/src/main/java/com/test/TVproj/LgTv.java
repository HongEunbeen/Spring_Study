package com.test.TVproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component("lgtv")
public class LgTv implements Tv{
	

	//@Autowired
	//@Qualifier("sony")
	@Resource(name="sony")
	SonySpeaker sony;
	
	@Override
	public void pweron() {
		// TODO Auto-generated method stub
		System.out.println("lgTv power on~~~");
	}

	@Override
	public void poweroff() {
		// TODO Auto-generated method stub
		System.out.println("lgTv power off~~~");
	}

	@Override
	public void volumnup() {
		// TODO Auto-generated method stub
		System.out.println("lgTv volum up~~~");
	}

	@Override
	public void volumdown() {
		// TODO Auto-generated method stub
		System.out.println("lgTv volum down~~~");
	}
}
