package com.parse;

public class ParseException extends Throwable{

	public static final int INVALID_EMAIL_ADDRESS = 0;
	public static final int EMAIL_MISSING = 1;
	public static final int EMAIL_TAKEN = 2;
	public static final int USERNAME_TAKEN = 3;
	public static final int INVALID_SESSION_TOKEN = 4;

	public int getCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
