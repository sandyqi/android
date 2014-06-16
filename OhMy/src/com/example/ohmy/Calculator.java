package com.example.ohmy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Calculator extends Activity implements OnClickListener{
Button add, sub, clear, submit;
TextView text;
ImageView logo;
String s;
int count=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculator);
		initial();
	}

	
	public void initial(){
		add = (Button)findViewById(R.id.calAdd);
		sub = (Button)findViewById(R.id.calSub);
		clear = (Button)findViewById(R.id.calClear);
		submit = (Button)findViewById(R.id.calSubmit);
		text = (TextView)findViewById(R.id.calText);

		add.setOnClickListener(this);
		sub.setOnClickListener(this);
		clear.setOnClickListener(this);
		submit.setOnClickListener(this);
		logo.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.calAdd:
			count ++;
			text.setText("Memeda "+count +" times");
			break;
		case R.id.calSub:
			count --;
			if(count>=0){
			text.setText("Memeda "+count +" times");}
			break;
		case R.id.calClear:
			count =0;
			text.setText("Start it over from 0");   // cannot set text in xml if I still want to setText IN Java
			break;
		case R.id.calSubmit:
			Intent it = new Intent(Calculator.this,Result.class);
			Bundle b = new Bundle();
			b.putInt("check",count );
			it.putExtras(b);
			startActivity(it);
			break;
	
		}
		// TODO Auto-generated method stub
		
	}

	public boolean onCreateOptionsMenu(android.view.Menu menu) { //add menu to a class
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.secondmenu, menu);  //first is resource menu, the secon is a data.
		return true;
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		Intent i = new Intent("com.example.ohmy.INFOR");
		startActivity(i);
		return true;
	}


	
	
	
}
