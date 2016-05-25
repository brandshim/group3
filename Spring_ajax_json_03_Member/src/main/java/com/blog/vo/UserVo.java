package com.blog.vo;

public class UserVo {

	private String user_name;
	private String user_email;
	private String user_id;
	private String user_pwd;
	private String user_birth;
	private String user_gender;
	private String user_address;
	private int user_phone;
	
	@Override
	public String toString() {
		return "UserVo [user_name=" + user_name + ", user_email=" + user_email + ", user_id=" + user_id + ", user_pwd="
				+ user_pwd + ", user_birth=" + user_birth + ", user_gender=" + user_gender + ", user_address="
				+ user_address + ", user_phone=" + user_phone + "]";
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public int getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
	}



}
