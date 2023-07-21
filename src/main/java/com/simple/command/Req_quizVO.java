package com.simple.command;

public class Req_quizVO {
	
	private String id;
	private String pw;
	
	public Req_quizVO() {
		
	}

	public Req_quizVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Req_quizVO [id=" + id + ", pw=" + pw + "]";
	}
	
	

}
