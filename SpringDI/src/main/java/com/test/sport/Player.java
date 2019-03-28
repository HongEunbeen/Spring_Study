package com.test.sport;

import java.util.ArrayList;

public class Player {
	String name;
	int age;
	ArrayList<String> position;
	double weight;
	double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<String> getPosition() {
		return position;
	}
	public void setPosition(ArrayList<String> position) {
		this.position = position;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	Player(){}
	Player(String name, int age, ArrayList<String> pos){
		this.name = name;
		this.age = age;
		this.position = pos;
	}
}
