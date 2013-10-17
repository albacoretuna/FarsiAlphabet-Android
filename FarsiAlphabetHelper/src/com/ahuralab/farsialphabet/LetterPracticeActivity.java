package com.ahuralab.farsialphabet;

import java.util.List;

import com.google.ads.AdRequest;

import com.google.ads.AdView;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;

import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.TextView;

public class LetterPracticeActivity extends FragmentActivity implements
		ActionBar.OnNavigationListener {

	/**
	 * The serialization (saved instance state) Bundle key representing the
	 * current dropdown position.
	 */
	private static final String STATE_SELECTED_NAVIGATION_ITEM = "selected_navigation_item";

	public static final int ISOLATED = 0;
	public static final int BEGIN = 1;
	public static final int MIDDLE = 2;
	public static final int END = 3;

	static List<LetterPhonologyItem> letterPhonologyItems = null;

	public static final String LETTER_INTENT_EXTRA = "LetterItem";
	public static final String INDEX_INTENT_EXTRA = "startingIndex";

	private LetterItem letterItem;
	private DummySectionFragment fragment;

	// private AdView adView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_letter_practice);

		/*
		 * // Create the adView adView = new AdView(this, AdSize.BANNER, "ID");
		 * 
		 * // Lookup your LinearLayout assuming it's been given // the attribute
		 * android:id="@+id/mainLayout" FrameLayout layout =
		 * (FrameLayout)findViewById(R.id.container);
		 * 
		 * // Add the adView to it layout.addView(adView);
		 * 
		 * // Initiate a generic request to load it with an ad adView.loadAd(new
		 * AdRequest());
		 */

		letterItem = (LetterItem) getIntent().getSerializableExtra(
				LETTER_INTENT_EXTRA);
		setTitle(getResources().getString(
				R.string.title_activity_letter_practice)
				+ letterItem.isolated + " (" + letterItem.name + ")");

		// Set up the action bar to show a dropdown list.
		final ActionBar actionBar = getActionBar();
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		// Show the Up button in the action bar.
		actionBar.setDisplayHomeAsUpEnabled(true);

		// Set up the dropdown list navigation in the action bar.
		actionBar
				.setListNavigationCallbacks(
						// Specify a SpinnerAdapter to populate the dropdown
						// list.
						new ArrayAdapter<String>(
								getActionBarThemedContextCompat(),
								android.R.layout.simple_list_item_1,
								android.R.id.text1, new String[] {
										letterItem.isolated
												+ " ("
												+ letterItem.name
												+ " - "
												+ getResources().getString(
														R.string.isolated)
												+ ")",
										letterItem.begin
												+ " ("
												+ letterItem.name
												+ " - "
												+ getResources().getString(
														R.string.begin) + ")",
										letterItem.middle
												+ " ("
												+ letterItem.name
												+ " - "
												+ getResources().getString(
														R.string.middle) + ")",
										letterItem.end
												+ " ("
												+ letterItem.name
												+ " - "
												+ getResources().getString(
														R.string.end) + ")", }),
						this);
		int startingIndex = getIntent().getIntExtra(INDEX_INTENT_EXTRA, BEGIN);
		if (savedInstanceState == null) {
			savedInstanceState = new Bundle();
		}
		savedInstanceState
				.putInt(STATE_SELECTED_NAVIGATION_ITEM, startingIndex);
		onRestoreInstanceState(savedInstanceState);
	}

	/**
	 * Backward-compatible version of {@link ActionBar#getThemedContext()} that
	 * simply returns the {@link android.app.Activity} if
	 * <code>getThemedContext</code> is unavailable.
	 */
	@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
	private Context getActionBarThemedContextCompat() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
			return getActionBar().getThemedContext();
		} else {
			return this;
		}
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		// Restore the previously serialized current dropdown position.
		if (savedInstanceState.containsKey(STATE_SELECTED_NAVIGATION_ITEM)) {
			getActionBar().setSelectedNavigationItem(
					savedInstanceState.getInt(STATE_SELECTED_NAVIGATION_ITEM));
		}
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		// Serialize the current dropdown position.
		outState.putInt(STATE_SELECTED_NAVIGATION_ITEM, getActionBar()
				.getSelectedNavigationIndex());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.letter_practice, menu);
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
		case R.id.action_refresh: {
			fragment.canvas.resetCanvas();
			return true;
		}
		case R.id.action_write: {
			Intent intent = new Intent(this.getApplicationContext(),
					WordCanvasActivity.class);
			intent.putExtra(WordCanvasActivity.INTENT_LETTER_FILTER,
					letterItem.isolated);
			startActivity(intent);
			return true;
		}
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public boolean onNavigationItemSelected(int position, long id) {
		// When the given dropdown item is selected, show its contents in the
		// container view.
		fragment = new DummySectionFragment();
		Bundle args = new Bundle();
		String letter = "";
		String isolatedLetter = "";
		isolatedLetter = letterItem.isolated;
		switch (position) {
		case ISOLATED: {
			letter = letterItem.isolated;
			break;
		}
		case BEGIN: {
			letter = letterItem.begin;
			break;
		}
		case MIDDLE: {
			letter = letterItem.middle;
			break;
		}
		case END: {
			letter = letterItem.end;
			break;
		}
		}
		String[] value = { isolatedLetter, letter };
		args.putStringArray(DummySectionFragment.ARG_LETTER_PHONOLOGY, value);
		// args.putString(DummySectionFragment.ARG_LETTER, letter);
		fragment.setArguments(args);
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, fragment).commit();
		return true;
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {

		public static final String ARG_LETTER_PHONOLOGY = "letter_phonology";
		CanvasTextView canvas;
		TextView phonologyCanvasLetters;

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_letter_practice_dummy, container, false);

			canvas = (CanvasTextView) rootView
					.findViewById(R.id.letterPracticeCanvas);
			canvas.setText(getArguments().getStringArray(ARG_LETTER_PHONOLOGY)[1]);
			

			phonologyCanvasLetters = (TextView) rootView
					.findViewById(R.id.pronounciationPhonology);

			letterPhonologyItems = LetterPhonologyItem.EXAMPLE_PHONOLOGY_LETTERS
					.get(getArguments().getStringArray(ARG_LETTER_PHONOLOGY)[0]);
			if (letterPhonologyItems != null && phonologyCanvasLetters != null) {
				phonologyCanvasLetters
						.setText(createTextPhonology(letterPhonologyItems));
			}
            // load add
			AdView adView = (AdView) rootView.findViewById(R.id.ad);
			if (adView != null) {
				adView.loadAd(new AdRequest());
			}

			return rootView;
		}

		private static String createTextPhonology(
				List<LetterPhonologyItem> items) {
			int numberOfLetters = 0;

			numberOfLetters = items.size();

			String text1 = " Phonology: ";

			for (int i = 0; i < numberOfLetters; i++) {

				text1 = " " + text1 + " \n " + " " + items.get(i).letterElement
						+ " ";
			}
			text1 = text1 + "\n";

			return text1;
		}
	}

	

}
