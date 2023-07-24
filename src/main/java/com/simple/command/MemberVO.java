package com.simple.command;

import java.util.ArrayList;

public class MemberVO {
	//1
	private String id;
	private String address;
	
	//M
	private ArrayList<ScoreVO> list;
	
	public MemberVO() {
		
	}

	public String getId() {
		return id;
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

	

	public MemberVO(String id, String address, ArrayList<ScoreVO> list) {
		super();
		this.id = id;
		this.address = address;
		this.list = list;
	}

	

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", address=" + address + ", list=" + list + "]";
	}

	public ArrayList<ScoreVO> getList() {
		return list;
	}

	public void setList(ArrayList<ScoreVO> list) {
		this.list = list;
	}
	
	

}
