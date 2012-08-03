package com.sync.note.messages;

public class RegisterMessage extends SuperMessage{

	String user;
	String pass1;
	
	public RegisterMessage(int m) {
		super(m);
		// TODO Auto-generated constructor stub
	}
	
	public RegisterMessage(String u, String p1){
		this(Messages.REGISTER_REQUEST);
		user = u;
		pass1 = p1;
	}
}
