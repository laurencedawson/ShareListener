package com.laurencedawson.sharelistener;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ListenerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String url = getIntent().getDataString(); 
		Intent share = new Intent(android.content.Intent.ACTION_SEND);
		share.putExtra(android.content.Intent.EXTRA_TEXT, url);
		share.setType("text/plain");
		startActivity(Intent.createChooser(share, "Share"));
		
		finish();
	}

}
