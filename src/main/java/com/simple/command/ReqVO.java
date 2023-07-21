package com.simple.command;

import java.util.ArrayList;

public class ReqVO {
	//만드는 규칙- VO와 동일하게 만듭니다.
	//폼값의 name과 동일한 변수를 멤버변수로 선언
	
	private String name;
	private String age;
	private ArrayList<String> inter; //checkbox
	
	public ReqVO() {
		
	}
	
	public ReqVO(String name, String age, ArrayList<String> inter) {
		super();
		this.name = name;
		this.age = age;
		this.inter = inter;
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

	public ArrayList<String> getInter() {
		return inter;
	}

	public void setInter(ArrayList<String> inter) {
		this.inter = inter;
	}

	@Override
	public String toString() {
		return "ReqVO [name=" + name + ", age=" + age + ", inter=" + inter + "]";
	}
	
	
	
	

}
