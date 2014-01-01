package com.ahuralab.farsialphabet;



import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.net.Uri;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class NumberPracticeActivity extends FragmentActivity implements
		ActionBar.OnNavigationListener {

	private DummySectionFragment fragment;

	/**
	 * The serialization (saved instance state) Bundle key representing the
	 * current dropdown position.
	 */
	private static final String STATE_SELECTED_NAVIGATION_ITEM = "selected_navigation_item";
	private DrawerLayout drawer;
	private ListView navList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_number_practice);

		// Set up the action bar to show a dropdown list.
		// final ActionBar actionBar = getActionBar();
		// actionBar.setDisplayShowTitleEnabled(false);
		// actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		// Show the Up button in the action bar.
		// actionBar.setDisplayHomeAsUpEnabled(true);

		// Set up the dropdown list navigation in the action bar.
		// actionBar.setListNavigationCallbacks(
		// Specify a SpinnerAdapter to populate the dropdown list.
		ArrayAdapter<NumberItem> adapter = new ArrayAdapter<NumberItem>(
				getActionBarThemedContextCompat(),
				android.R.layout.simple_list_item_1, android.R.id.text1,
				NumberItem.NUMBERS);
		drawer = (DrawerLayout) findViewById(R.id.drawer_layout_number);
		navList = (ListView) findViewById(R.id.drawer_number);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);

		navList.setAdapter(adapter);

		drawer.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);

		navList.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					final int pos, long id) {
				fragment = new DummySectionFragment();
				Bundle args = new Bundle();
				args.putString(DummySectionFragment.ARG_LETTER,
						NumberItem.NUMBERS[pos].getValue());
				fragment.setArguments(args);
				getSupportFragmentManager().beginTransaction()
						.replace(R.id.container, fragment).commit();
				drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
				drawer.setDrawerListener(new DrawerLayout.SimpleDrawerListener() {
					@Override
					public void onDrawerClosed(View drawerView) {
						super.onDrawerClosed(drawerView);

					}

				});
				drawer.closeDrawer(navList);

			}
		});

		if (savedInstanceState == null) {
			savedInstanceState = new Bundle();
		}
		savedInstanceState.putInt(STATE_SELECTED_NAVIGATION_ITEM, 0);
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
		fragment = new DummySectionFragment();
		Bundle args = new Bundle();
		args.putString(DummySectionFragment.ARG_LETTER,
				NumberItem.NUMBERS[savedInstanceState
						.getInt(STATE_SELECTED_NAVIGATION_ITEM)].getValue());
		fragment.setArguments(args);
		getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, fragment).commit();
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
		getMenuInflater().inflate(R.menu.number_practice, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

		case R.id.action_snapshot: {
			ShareScreenShot shareScreenShot = new  ShareScreenShot();
			View _rootView = findViewById(android.R.id.content).getRootView();
			Uri screenshotUri = 
					shareScreenShot.saveScreenShot(shareScreenShot.takeScreenShot
							(_rootView));

			// send an email
				
			startActivity(Intent.createChooser(shareScreenShot.sendEmail(screenshotUri)
					, "Send mail..."));
			return true;
		}

		case R.id.action_question: {

			showDialog(getString(R.string.numbers_help),
					getString(R.string.attention));

			return true;
		}
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
		case R.id.action_drawer: {
			drawer.openDrawer(navList);
			return true;
		}
		}
		return super.onOptionsItemSelected(item);
	}
	

	@Override
	public boolean onNavigationItemSelected(int position, long id) {

		return false;
	}

	protected void showDialog(String message, String title) {

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle(title).setMessage(message);
		// Create the AlertDialog object and show it
		builder.show();
	}

	/**
	 * A dummy fragment representing a section of the app, but that simply
	 * displays dummy text.
	 */
	public static class DummySectionFragment extends Fragment {
		public static final String ARG_LETTER = "letter";
		CanvasTextView canvas;

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(
					R.layout.fragment_number_practice_dummy, container, false);
			canvas = (CanvasTextView) rootView
					.findViewById(R.id.numberPracticeCanvas);
			canvas.setText(getArguments().getString(ARG_LETTER));

			AdView adView = (AdView) rootView.findViewById(R.id.ad);
			if (adView != null) {
				adView.loadAd(new AdRequest());
			}

			return rootView;
		}
	}

}
