package com.jcheed06.myhealthapp.test;

import com.jcheed06.myhealthapp.LoginActivity;

import android.test.ActivityInstrumentationTestCase2;

public class LoginActivityTest extends ActivityInstrumentationTestCase2<LoginActivity> {
	private static final String CORRECT_USERNAME = "cristianhalman";  
	private static final String INCORRECT_PASSWORD = "lblalababllabla";  
	private static final String CORRECT_PASSWORD = "password";  

	public LoginActivityTest() {
		super("com.jcheed06.myhealthapp", LoginActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testIncrementIncorrectLoginsIntIfCredentialsWrong() {  
		   sendKeys(CORRECT_USERNAME);
		   sendKeys("ENTER");
		   sendKeys(INCORRECT_PASSWORD);
		   sendKeys("ENTER");
		   
		   
		   // get result  
		   //String mathResult = result.getText().toString();  
		   //assertTrue("Add result should be 98", mathResult.equals(ADD_RESULT));  
		}  
}
