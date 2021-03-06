package com.jcheed06.myhealthapp.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;

import com.jcheed06.myhealthapp.LoginActivity;
import com.jcheed06.myhealthapp.R;

public class LoginActivityTest extends ActivityInstrumentationTestCase2<LoginActivity> {
	private static final String CORRECT_USERNAME = "cristianhalman";  
	private static final String INCORRECT_PASSWORD = "lblalababllabla";  
	private static final String CORRECT_PASSWORD = "password";  

	private int incorrectLogins;
	
	public LoginActivityTest() {
		super("com.jcheed06.myhealthapp", LoginActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testIncrementIncorrectLoginsIntIfWrongCredentials() {  
		   sendKeys(CORRECT_USERNAME);
		   sendKeys("ENTER");
		   sendKeys(INCORRECT_PASSWORD);
		   sendKeys("ENTER");
		   
		   LoginActivity loginActivity = getActivity();
		   
		   incorrectLogins = loginActivity.getIncorrectLogins();
		   final Button button = (Button) loginActivity.findViewById(R.id.btn_login);
		   
		   loginActivity.runOnUiThread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				button.performClick();
			}
			   
		   });
		   
		   
		   
		   Integer updatetIncorrectLogins = new Integer(loginActivity.getIncorrectLogins());
		   assertTrue("Incorrect login test:", updatetIncorrectLogins.equals((incorrectLogins + 1)));  
		}  
}
