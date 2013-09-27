package com.jcheed06.myhealthapp.test;

import com.jcheed06.myhealthapp.MainActivity;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
	//private TextView result;

	public MainActivityTest() {
		super("com.jcheed06.myhealthapp", MainActivity.class);
	}

	protected void setUp() throws Exception {
		MainActivity mainActivity = getActivity();
		//result = (TextView) mainActivity.findViewById(R.id.result);  
	}

}
