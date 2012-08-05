package com.sync.note.messages;

public class LoginMessage extends SuperMessage{

	private String username;
	private String password;
	
	public LoginMessage(int m) {
		super(m);
		// TODO Auto-generated constructor stub
	}
	
	public LoginMessage(String u, String pass) {
		// TODO Auto-generated constructor stub
		this(Messages.LOGIN_REQUEST);
		username = u;
		password = pass;
	}
	
	public String getUserName(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}

}
