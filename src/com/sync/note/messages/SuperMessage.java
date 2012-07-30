package com.sync.note.messages;

import java.io.Serializable;

/**
 * Parent class of different Message classes(LoginMessage...GetNoteMessage...)
 * @author kinmuriel
 *
 */
public class SuperMessage implements Serializable{

	private int messageType;
	
	public SuperMessage(int m) {
		// TODO Auto-generated constructor stub
		messageType = m;
	}
	/**
	 * 
	 * @return messageType
	 */
	public int getMessageType(){
		return messageType;
	}
}
