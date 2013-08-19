package com.ahuralab.farsialphabet;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

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

		// Increment app opened counter
		// showRateUsDialogIfNecessary();

		// String[] tooltips = getResources().getStringArray(R.array.tooltips);
		// createDialog((int) Math.floor(Math.random() * tooltips.length),
		// tooltips);
	}

	private void createDialog(final int position, final String[] tooltips) {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle(R.string.tooltips_title);
		builder.setIcon(R.drawable.ic_stat_tooltips);
		builder.setMessage(tooltips[position]);
		// Add the buttons
		builder.setNegativeButton(android.R.string.ok,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						// User clicked OK button
						dialog.dismiss();
					}
				});
		builder.setPositiveButton(R.string.next,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						// User cancelled the dialog
						dialog.dismiss();
						createDialog((position + 1) % tooltips.length, tooltips);
					}
				});

		// Create the AlertDialog
		AlertDialog dialog = builder.create();
		dialog.show();
	}

	private void showRateUsDialogIfNecessary() {
		AppPreferencesWrapper prefs = new AppPreferencesWrapper(this);
		int counter = prefs.incrementAppOpenedCounter();

		if (counter % 5 == 0 && !prefs.getShouldAskToRate()) {
			// Show rate us dialog
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle(R.string.please_rate_use_title)
					.setMessage(R.string.please_rate_use_text)
					.setPositiveButton(R.string.yes,
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									// Go and rate
									Uri uri = Uri.parse("market://details?id="
											+ MainActivity.this
													.getPackageName());
									Intent goToMarket = new Intent(
											Intent.ACTION_VIEW, uri);
									try {
										MainActivity.this
												.startActivity(goToMarket);
										AppPreferencesWrapper prefs = new AppPreferencesWrapper(
												MainActivity.this);
										prefs.setShouldAskToRate(false);
									} catch (ActivityNotFoundException e) {
										Log.w("MainActivity",
												"Could not open marketplace application.");
									}
								}
							})
					.setNegativeButton(R.string.no_thanks,
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									// User cancelled the dialog
									AppPreferencesWrapper prefs = new AppPreferencesWrapper(
											MainActivity.this);
									prefs.setShouldAskToRate(false);
								}
							})
					.setNeutralButton(R.string.remind_me_later,
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									// User want to be reminded later
									// Nothing to do.
								}
							});
			// Create the AlertDialog object and show it
			builder.show();
		}
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
		case R.id.action_numbers: {
			Intent intent = new Intent(this.getApplicationContext(),
					NumberPracticeActivity.class);
			startActivity(intent);
			return true;
		}

		case R.id.action_question: {
			String[] tooltips = getResources().getStringArray(R.array.tooltips);
			createDialog((int) Math.floor(Math.random() * tooltips.length),
					tooltips);
			return true;
		}
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
