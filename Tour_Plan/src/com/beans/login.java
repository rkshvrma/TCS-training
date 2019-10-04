package com.beans;

public class login {

	private int user_id;
	private String login_id;
	private String password;
	private String user_name;
	private String user_type;

	public login(int user_id, String login_id, String password, String user_name, String user_type) {
		super();
		this.user_id = user_id;
		this.login_id = login_id;
		this.password = password;
		this.user_name = user_name;
		this.user_type = user_type;
	}

	public login() {
		super();
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	@Override
	public String toString() {
		return "login [user_id=" + user_id + ", login_id=" + login_id + ", password=" + password + ", user_name="
				+ user_name + ", user_type=" + user_type + "]";
	}

}
