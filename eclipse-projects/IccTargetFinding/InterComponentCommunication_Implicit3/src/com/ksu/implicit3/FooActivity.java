package com.ksu.implicit3;

import com.ksu.implicit3.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class FooActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_foo);
		Intent i = getIntent();
		String imei = i.getStringExtra("data");
		Log.d("deviceid", imei);
	}
}
