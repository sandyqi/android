 package com.arif.listviewexample;  
 import java.util.ArrayList;  
import java.util.List;  


import android.app.Activity;  
import android.os.Bundle;  
import android.view.View;  
import android.view.View.OnClickListener;  
import android.widget.Button;  
import android.widget.ListView;  

import com.arif.adapters.CompleteListAdapter;  
 public class CompleteListActivity extends Activity implements OnClickListener {  
      private ListView mCompleteListView;  
      private Button mAddItemToList;  
      private List<String> mItems;  
      private CompleteListAdapter mListAdapter;  
      private static final int MIN = 0, MAX = 10000;  
      @Override  
      protected void onCreate(Bundle savedInstanceState) {  
           super.onCreate(savedInstanceState);  
           setContentView(R.layout.activity_complete_list);  
           initViews();  
           mItems = new ArrayList<String>();  
           //create listAdapter
           mListAdapter = new CompleteListAdapter(this, mItems);  
           //set listVIew a listAdapter
           mCompleteListView.setAdapter(mListAdapter);  
      }  
      private void initViews() {  
           mCompleteListView = (ListView) findViewById(R.id.completeList);  
           mAddItemToList = (Button) findViewById(R.id.addItemToList);  
           mAddItemToList.setOnClickListener(this);  
      }  
      private void addItemsToList() {  
           int randomVal = MIN + (int) (Math.random() * ((MAX - MIN) + 1));  
           mItems.add(String.valueOf(randomVal));  
           mListAdapter.notifyDataSetChanged();  // when the button is clicked, this method is triggered.
      }  
      @Override  
      public void onClick(View v) {  
           switch (v.getId()) {  
           case R.id.addItemToList:  
                addItemsToList();  
                break;  
           }  
      }  
 }  
