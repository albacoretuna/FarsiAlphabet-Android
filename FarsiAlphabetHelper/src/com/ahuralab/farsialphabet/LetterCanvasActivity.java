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
import android.widget.ImageButton;
import android.widget.TextView;
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
	private TextView infoText;
	private TextView infoStandalone;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_letter_canvas);
		// Show the Up button in the action bar.
		setupActionBar();

		infoText = (TextView) findViewById(R.id.letterInfo);
		infoStandalone = (TextView)findViewById(R.id.standaloneInfo);

		canvas = (CanvasTextView) findViewById(R.id.letterCanvas);
		Intent intent = getIntent();
		String[] dataStrings = intent.getStringArrayExtra(LETTER_INTENT_EXTRA);
		if (dataStrings != null) {
			canvas.setText(dataStrings[0]);
			setTitle("Practice drawing: " + dataStrings[0]);
			setTextViewInfo(dataStrings[1], dataStrings[0], dataStrings[2], dataStrings[3]);
		}

		// Reset
		ImageButton resetButton = (ImageButton) findViewById(R.id.buttonResetCanvas);
		resetButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				canvas.resetCanvas();
			}
		});

		Toast.makeText(getApplicationContext(), R.string.canvas_toast_message,
				Toast.LENGTH_SHORT).show();
	}

	private void setTextViewInfo(String position, String letter, String farsiExa, String englishExa) {

		if (position.equals("begin")) {
			infoText.setText(String.format(LetterCanvasActivity.this
					.getResources().getString(R.string.letter_begin), letter, farsiExa, englishExa));
			infoStandalone.setText(String.format(LetterCanvasActivity.this
					.getResources().getString(R.string.right_to_left)));
		}

		else if (position.equals("middle")) {
			infoText.setText(String.format(LetterCanvasActivity.this
					.getResources().getString(R.string.letter_middle), letter, farsiExa, englishExa));
			infoStandalone.setText(String.format(LetterCanvasActivity.this
					.getResources().getString(R.string.right_to_left)));
		}
	

		else if (position.equals("end")) {
			infoText.setText(String.format(LetterCanvasActivity.this
					.getResources().getString(R.string.letter_end), letter, farsiExa, englishExa));
			infoStandalone.setText(String.format(LetterCanvasActivity.this
					.getResources().getString(R.string.standalone_end_letters)));
		}

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
