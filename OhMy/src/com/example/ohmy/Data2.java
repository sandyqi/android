package com.example.ohmy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Data2 extends Activity{
	EditText text;
	TextView view;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radioresult);
		Button b = (Button)findViewById(R.id.data2Button);
		view = (TextView)findViewById(R.id.data2view);
		text = (EditText)findViewById(R.id.data2Resule);
		b.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent in = new Intent(Data2.this,Data.class);
				Bundle b1 = new Bundle();
				String pass = text.getText().toString();
				b1.putString("key", pass);
				in.putExtras(b1);
				startActivityForResult(in,0); //trigger as a click
			}
			
		});

	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(resultCode == RESULT_OK){
			Bundle b4 = data.getExtras();
			String s = b4.getString("answer");
			view.setText(s);
		}
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
	//	super.onCreateOptionsMenu(menu);
		MenuInflater data2menu = getMenuInflater();
		data2menu.inflate(R.menu.data2menu, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
	
		switch(item.getItemId()){
		case R.id.data2menumenu:
			Intent i = new Intent("com.example.ohmy.DATA");
			startActivity(i);
			break;
		case R.id.data2menuexit:
			finish();
			break;
		}
		
		return true;
	}
	
	
	
	

}
