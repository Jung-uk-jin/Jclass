package com.naver.www;

public class member {
	private String id;
	private String name;
	private String hobby;
	
	public member() {}
	public member(String id, String name, String hobby) {
		this.id=id;
		this.name=name;
		this.hobby=hobby;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


}
