package com.ahuralab.farsialphabet;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 
 * @author msama (michele.sama@gmail.com)
 * @author psaeedi (panteha.s@gmail.com)
 *
 */
public class LetterCanvasActivity extends Activity {

	public static final String LETTER_INTENT_EXTRA = "letter";
	
	private CanvasTextView canvas;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_letter_canvas);
		// Show the Up button in the action bar.
		setupActionBar();
		
		canvas = (CanvasTextView) findViewById(R.id.letterCanvas);
		Intent intent = getIntent();
		String letter = intent.getStringExtra(LETTER_INTENT_EXTRA);
		if (letter != null) {
			canvas.setText(letter);
			setTitle("Practice drawing: " + letter);
		}
		
		// Reset
		Button resetButton = (Button) findViewById(R.id.buttonResetCanvas);
		resetButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				canvas.resetCanvas();
			}
		});
	
		Toast.makeText(getApplicationContext(),
				R.string.canvas_toast_message, 
				Toast.LENGTH_SHORT).show();
	}

	
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.letter_canvas, menu);
		return true;
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home: {
				// This ID represents the Home or Up button. In the case of this
				// activity, the Up button is shown. Use NavUtils to allow users
				// to navigate up one level in the application structure. For
				// more details, see the Navigation pattern on Android Design:
				//
				// http://developer.android.com/design/patterns/navigation.html#up-vs-back
				//
				NavUtils.navigateUpFromSameTask(this);
				return true;
			}
			case R.id.action_clear: {
				canvas.resetCanvas();
				return true;
			}
		}
		return super.onOptionsItemSelected(item);
	}

}