package com.example.ohmy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Result extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calresult);
		TextView text1 = (TextView)findViewById(R.id.calText1);
		TextView text2 = (TextView)findViewById(R.id.calText2);
		ImageView image = (ImageView)findViewById(R.id.calView1);
		Bundle b =getIntent().getExtras();
		int count = b.getInt("check");
		text2.setText("The score is "+ count);
	}
	
}
