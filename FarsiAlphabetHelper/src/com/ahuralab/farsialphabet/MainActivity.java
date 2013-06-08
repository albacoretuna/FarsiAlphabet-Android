package com.ahuralab.farsialphabet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

/**
 * @author michele.sama@gmail.com
 * @author panteha.s@gmail.com
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView list = (ListView) findViewById(R.id.letterList);
		list.setAdapter(new LetterListAdapter(this));
		
		Toast.makeText(getApplicationContext(),
				R.string.welcome_toast_message, 
				Toast.LENGTH_SHORT).show();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
			case R.id.action_about: {
				Intent intent = new Intent(this.getApplicationContext(),
						AboutActivity.class);
				startActivity(intent);
				return true;
			}
			default: {
				return super.onOptionsItemSelected(item);
			}
		}
	}
}
