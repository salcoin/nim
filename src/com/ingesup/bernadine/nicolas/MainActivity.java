package com.ingesup.bernadine.nicolas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	Button button;
	ImageView image;
	Boolean IAactivated = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ToggleButton toggle = (ToggleButton)findViewById(R.id.changeModeButton);
        if( IAactivated == false ) {
            toggle.setChecked(true);
        } else {
            toggle.setChecked(false);
        }        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onToggleClicked(View view) {

	    boolean buttonState = ((ToggleButton) view).isChecked();
	    
	    if (buttonState) {
	    	IAactivated = true;
	    } else {
	    	IAactivated = false;
	    }
	}

}
