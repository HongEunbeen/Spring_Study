package com.test.TVproj;

public class SamsungTv implements Tv{
	
	SonySpeaker sony;
	int price;
	
	SamsungTv(){
		System.out.println("samsumgTv() 객체생성");
	}
	
	SamsungTv(SonySpeaker sony){
		this.sony = sony;
		System.out.println("samsumgTv(sony) 객체생성");
	}
	
	SamsungTv(SonySpeaker sony, int price){
		this.sony = sony;
		this.price = price;
		System.out.println("samsumgTv(sony, price) 객체생성");
	}
	
	@Override
	public void pweron() {
		// TODO Auto-generated method stub
		System.out.println("saumsungTv power on~~~ + price ("+ price +")");
	}

	@Override
	public void poweroff() {
		// TODO Auto-generated method stub
		System.out.println("saumsungTv power off~~~");
	}

	@Override
	public void volumnup() {
		// TODO Auto-generated method stub
		System.out.println("saumsungTv volum up~~~");
	}

	@Override
	public void volumdown() {
		// TODO Auto-generated method stub
		System.out.println("saumsungTv volum down~~~");
	}

}
