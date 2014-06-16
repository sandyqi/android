package com.example.ohmy;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {
String[] classes = {"Calculator", "Data2","BB","CC","DD","EE"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);                        //SHOULD not be 0
		setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_expandable_list_item_1,classes));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String selected = classes[position];
		try {
			Class nextClass = Class.forName("com.example.ohmy."+selected);
			Intent theIntent = new Intent(Menu.this, nextClass);
			startActivity(theIntent);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) { //sdk menu class, not the class we are doing now
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater blowUp = getMenuInflater();
		blowUp.inflate(R.menu.coolmenu, menu);  //first is resource menu, the secon is a data.
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {  // add activity to the button of menu
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.menuAboutUs:
			Intent i = new Intent("com.example.ohmy.ABOUT");
			startActivity(i);
			break;
		case R.id.menuPreference:
			Intent p = new Intent("com.example.ohmy.PREFS");
			startActivity(p);
			break;
		case R.id.menuExit:
			finish();
			break;
		}
		return true;
	}


}
