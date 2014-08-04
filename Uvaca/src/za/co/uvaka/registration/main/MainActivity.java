package za.co.uvaka.registration.main;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("onCreate", "onCreate called....");
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.activity_main, menu);
//		return true;
//	}
	
	public void startLoginActivity(View v) {
		Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class); 
		startActivity(loginIntent);
	}
	
	protected void onStart() {
		super.onStart();
		Log.i("onStart", "onStart called....");
	}

	protected void onResume() {
		super.onResume();
		Log.i("onResume", "onResume called....");
	}
	
	protected void onPause() {
		super.onPause();
		Log.i("onPause", "onPause called....");
	}
	
	protected void onStop() {
		super.onStop();
		Log.i("onStop", "onStop called....");
	}
	
	protected void onRestart() {
		super.onRestart();
		Log.i("onRestart", "onRestart called....");
	}
	
	protected void onDestroy() {
		super.onDestroy();
		Log.i("onDestroy", "onDestroy called....");
	}
	
	
	
	
}
