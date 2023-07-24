package com.simple.command;

public class ScoreVO {
	private int num;
	private String name;
	private String kor;
	private String eng;
	
	private String id;
	private String address;
	
	public ScoreVO() {
		
	}

	

	public ScoreVO(int num, String name, String kor, String eng, String id, String address) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.id = id;
		this.address = address;
	}



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}	

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ScoreVO [num=" + num + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", id=" + id + ", address="
				+ address + "]";
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	
}
