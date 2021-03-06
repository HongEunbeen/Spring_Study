package com.test.divEx7;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//@Configuration -- 클래스 앞에 사용 이클래스는 스프링 설정에 사용되는 클래스이다. 
@Configuration
public class Config {
	
//@Bean ->메소드 앞에 선언 "객체를 생성한다."
	@Bean
	public Player player1() { //player1객체
		ArrayList<String> position = new ArrayList<String>();
		position.add("1루수");
		position.add("타자");
		position.add("포수");
		Player p1 = new Player("추신수", 33, position);
		p1.setWeight(100);
		p1.setHeight(180);
		return p1;
	}
	@Bean
	public Player player2() {
		ArrayList<String> position = new ArrayList<String>();
		position.add("1루수");
		position.add("타자");
		position.add("포수");
		Player p1 = new Player("박찬호", 40, position);
		p1.setWeight(80);
		p1.setHeight(160);
		return p1;
	}
}
