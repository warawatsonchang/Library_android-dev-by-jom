package com.example.androidmenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	
	Menu menu;
	//ToggleButton toggleButtonUp, toggleButtonDown;
	
	Boolean savedMenuUpIsVisible, savedMenuDownIsVisible;
	final static String KEY_Menu_Up = "KEY_MENU_UP";
	final static String KEY_Menu_Down = "KEY_MENU_DOWN";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		toggleButtonUp = (ToggleButton)findViewById(R.id.buttonup);
//		toggleButtonDown = (ToggleButton)findViewById(R.id.buttondown);
//		
//		toggleButtonUp.setOnCheckedChangeListener(new OnCheckedChangeListener(){
//
//			@Override
//			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//				
//				if(menu != null){
//					MenuItem item_up = menu.findItem(R.id.action_up);
//					item_up.setVisible(isChecked);
//				}
//				
//			}});
//		
//		toggleButtonDown.setOnCheckedChangeListener(new OnCheckedChangeListener(){
//
//			@Override
//			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//				
//				if (menu != null){
//					MenuItem item_down = menu.findItem(R.id.action_down);
//					item_down.setVisible(isChecked);
//				}
//				
//			}});
//		
//		if(savedInstanceState != null){
//			savedMenuUpIsVisible = savedInstanceState.getBoolean(KEY_Menu_Up, true);
//			savedMenuDownIsVisible = savedInstanceState.getBoolean(KEY_Menu_Down, true);
//		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		this.menu = menu;
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch(item.getItemId()){
		case R.id.action_settings:
			Toast.makeText(getApplicationContext(), "Setting...", 	Toast.LENGTH_SHORT).show();
			break;
//		case R.id.action_up:
//			Toast.makeText(getApplicationContext(), "Up...", Toast.LENGTH_SHORT).show();
//			break;
//		case R.id.action_down:
//			Toast.makeText(getApplicationContext(), "Down...", Toast.LENGTH_SHORT).show();
//			break;
		case R.id.action_other:
			Toast.makeText(getApplicationContext(), "Other...", Toast.LENGTH_SHORT).show();
			break;
		default:
			Toast.makeText(getApplicationContext(), "Unknown...", Toast.LENGTH_SHORT).show();
			break;
		}
		
		//Return false to allow normal menu processing to proceed, 
		//true to consume it here.
		return false;
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		
//		if(savedMenuUpIsVisible != null){
//			MenuItem item_up = menu.findItem(R.id.action_up);
//			item_up.setVisible(savedMenuUpIsVisible);
//		}
//		
//		if(savedMenuDownIsVisible != null){
//			MenuItem item_down = menu.findItem(R.id.action_down);
//			item_down.setVisible(savedMenuDownIsVisible);
//		}

		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		
//		if (menu != null){
//			MenuItem item_up = menu.findItem(R.id.action_up);
//			outState.putBoolean(KEY_Menu_Up, item_up.isVisible());
//			MenuItem item_down = menu.findItem(R.id.action_down);
//			outState.putBoolean(KEY_Menu_Down, item_down.isVisible());
//		}
		
	}

}
