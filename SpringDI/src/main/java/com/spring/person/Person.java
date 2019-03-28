package com.spring.person;

public class Person {
	private String name;
	private String age;
	private String gender;
	private String idno;
	
	public Person(){}
	public Person(String name, String age, String gender, String idno) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.idno = idno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
}
