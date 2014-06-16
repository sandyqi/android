package com.example.ohmy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class Data extends Activity implements OnCheckedChangeListener, OnClickListener{
	
Button b4;
TextView t1,t2;
RadioGroup g;
String text;
String fdata2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.radiogroup);
		Bundle b2 =getIntent().getExtras();
		fdata2 = b2.getString("key");
		initial();
		g.setOnCheckedChangeListener(this);
		b4.setOnClickListener(this);
		
		
	}
	
	public void initial(){
		b4 = (Button)findViewById(R.id.radiob4);
		t1 = (TextView)findViewById(R.id.radioView1);
		t1.setText(fdata2);
		t2 = (TextView)findViewById(R.id.radioView2);
		g = (RadioGroup)findViewById(R.id.raidoGroup);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch(checkedId){
		case R.id.radiob1:
		 //   bundle.putInt("b1",10 );
			text = "Exactly";
		//	it.putExtras(bundle);
			break;
		case R.id.radiob2:
		//	bundle.putInt("b2",5 );
			text = "Probably";
		//	it.putExtras(bundle);
			break;
		case R.id.radiob3:
		//	bundle.putInt("b3",0 );
			text = "WTF!";
		//	it.putExtras(bundle);
			break;
		}
		t2.setText(text);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {
		
			Intent it = new Intent(); // cannot put is outside the method
			Bundle b3 = new Bundle();  //message passes from back to front class. 
			b3.putString("answer", text);
			it.putExtras(b3);
			setResult(RESULT_OK, it);
			finish();
		}
		// TODO Auto-generated method stub
		
	
	

}
