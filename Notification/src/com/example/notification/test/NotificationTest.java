package com.example.notification.test;


import com.example.notification.MainActivity;
import com.example.notification.R;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.Button;
import android.widget.TextView;


public class NotificationTest extends ActivityInstrumentationTestCase2<MainActivity>{
	private MainActivity mActivity;
	private Button refresh;
	private TextView nCenter;
	public NotificationTest() { // cannot put any parameter here.
		super("com.example.notification",MainActivity.class);
		// TODO Auto-generated constructor stub
	}


	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		mActivity = getActivity();
		nCenter = (TextView)mActivity.findViewById(R.id.notificationCenter);
	}
	@MediumTest
	public void testPreconditions(){
		assertNotNull("Notification Activity is null", mActivity);
	//	assertNotNull("Main page is not null",nCenter.getText());
	}

}
