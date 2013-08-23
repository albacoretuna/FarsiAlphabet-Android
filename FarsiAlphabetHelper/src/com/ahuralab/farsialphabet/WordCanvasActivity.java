package com.ahuralab.farsialphabet;

import java.util.List;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Context;
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

public class WordCanvasActivity extends FragmentActivity implements
		ActionBar.OnNavigationListener {

	/**
	 * The serialization (saved instance state) Bundle key representing the
	 * current dropdown position.
	 */
	private static final String STATE_SELECTED_NAVIGATION_ITEM = "selected_navigation_item";
	public static final String INTENT_LETTER_FILTER = "letter_filter";

	List<WordItem> items = null;
	static List<LettersInWordItem> letterItemsInWords = null;
	private DummySectionFragment fragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_word_canvas);

		// Set up the action bar to show a dropdown list.
		final ActionBar actionBar = getActionBar();
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		// Show the Up button in the action bar.
		actionBar.setDisplayHomeAsUpEnabled(true);

		// FIlter only words containing a selected letter
		String filter = getIntent().getStringExtra(INTENT_LETTER_FILTER);

		items = null;
		if (filter != null) {
			items = WordItem.EXAMPLE_WORDS.get(filter);
		}
		if (items == null) {
			items = WordItem.EXAMPLE_WORDS.get("ﺍ");
		}

		// Set up the dropdown list navigation in the action bar.
		actionBar.setListNavigationCallbacks(
		// Specify a SpinnerAdapter to populate the dropdown list.
				new ArrayAdapter<WordItem>(getActionBarThemedContextCompat(),
						android.R.layout.simple_list_item_1,
						android.R.id.text1, items), this);
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
		getMenuInflater().inflate(R.menu.word_canvas, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

		case R.id.action_question:
			showDialog(getString(R.string.words_help),
					getString(R.string.attention));
			break;
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
			fragment.getWordCanvas().resetCanvas();
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
		args.putString(DummySectionFragment.ARG_FARSI_WORD,
				items.get(position).farsi);
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
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_FARSI_WORD = "section_number";

		// private static ByteArrayInputStream inputStream;

		private CanvasTextView wordCanvas;
		private CanvasTextView wordCanvasLetters1;
		private CanvasTextView wordCanvasLetters2;

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_word_canvas_dummy, container, false);
			wordCanvasLetters1 = (CanvasTextView) rootView
					.findViewById(R.id.wordLettersCanvas);
			wordCanvasLetters2 = (CanvasTextView) rootView
					.findViewById(R.id.pronounciationCanvas);
			// String i = getArguments().getString(ARG_FARSI_WORD);
			letterItemsInWords = LettersInWordItem.EXAMPLE_WORDS_LETTERS
					.get(getArguments().getString(ARG_FARSI_WORD));

			if (letterItemsInWords != null) {
				wordCanvasLetters1.setText(createText(letterItemsInWords));
			}

			wordCanvas = (CanvasTextView) rootView
					.findViewById(R.id.wordCanvas);
			wordCanvas.setText(getArguments().getString(ARG_FARSI_WORD));

			AdView adView = (AdView) rootView.findViewById(R.id.ad);
			adView.loadAd(new AdRequest());

			return rootView;
		}

		private String createText(List<LettersInWordItem> letterItems) {
			int numberOfLetters = letterItems.size();
			String text1 = "Letters: ";
			String text2 = "Pronunciation: ";

			for (int i = 0; i < numberOfLetters; i++) {
				if (i == numberOfLetters - 1) {
					text2 = text2 + letterItems.get(i).letterElement;
					wordCanvasLetters2.setText(text2);
				} else if (i == numberOfLetters - 2) {
					text1 = text1 + letterItems.get(i).letterElement;
				} else {
					text1 = text1 + letterItems.get(i).letterElement + " - ";
				}
			}
			return text1;
		}

		CanvasTextView getWordCanvas() {
			return wordCanvas;
		}

	}

	protected void showDialog(String message, String title) {

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle(title).setMessage(message);
		// Create the AlertDialog object and show it
		builder.show();
	}

}
