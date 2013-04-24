package com.monsterapps.cprograms;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	public boolean onTouchEvent(MotionEvent evt)
    {
    	if(evt.getAction() == MotionEvent.ACTION_DOWN)
    	{
    		//Passing control to next Activity
    		startActivity(new Intent(MainActivity.this,ProgramList.class));
    		
    	}
    	return true;
    }

}
