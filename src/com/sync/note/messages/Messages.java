package com.sync.note.messages;

/**
 * This class includes different message types.
 * This types will be used like header in SuperMessage instances.
 * 
 * @author kinmuriel
 *
 */
public class Messages {

	public static final int OK_ANSWER = 0;
	public static final int ERROR_ANSWER = -1;
	public static final int GOOD_LOGIN_ANSWER = 1;
	public static final int BAD_LOGIN_ANSWER = 2;
	public static final int LOGIN_REQUEST = 3;
	public static final int REGISTER_REQUEST = 4;
	public static final int GOOD_REGISTER_ANSWER = 5;
	public static final int BAD_REGISTER_ANSWER = 6;
}
