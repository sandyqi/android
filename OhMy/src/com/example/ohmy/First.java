package com.example.ohmy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class First extends Activity{
String[] word = {"H","e","l","l","o",",","S","a","n","d","y"}; 
TextView text;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		text = (TextView)findViewById(R.id.firstText);
	//	initial();
	Thread	 t1 = new Thread(){
				public void run(){
					try{
						sleep(2000);
					}catch(Exception e){
						e.printStackTrace();
					}finally{Intent nextPage = new Intent("com.example.ohmy.MENU");
					startActivity(nextPage);}
				}
			};
			t1.start();	
		
	}
	
	
	
			
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	

}
