package com.sync.note.messages;

import java.io.Serializable;

public class SuperMessage implements Serializable{

	private int messageType;
	
	public SuperMessage(int m) {
		// TODO Auto-generated constructor stub
		messageType = m;
	}
	
	public int getMessageType(){
		return messageType;
	}
}
