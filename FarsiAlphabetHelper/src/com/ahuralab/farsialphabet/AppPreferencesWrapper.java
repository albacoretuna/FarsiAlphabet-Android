/**
 * 
 */
package com.ahuralab.farsialphabet;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * @author michele.sama@gmail.com
 * @author panteha.s@gmail.com
 * 
 *         Helper class for shared preferences.
 */
public class AppPreferencesWrapper {

	private static final String APP_OPENED_COUNTER = "AppOpenedCounter";
	private static final String SHOULD_ASK_TO_RATE = "ShouldAskToRate";

	private final SharedPreferences preferences;

	AppPreferencesWrapper(Context context) {
		this(context.getSharedPreferences(context.getPackageName(),
				Context.MODE_PRIVATE));
	}

	AppPreferencesWrapper(SharedPreferences preferences) {
		this.preferences = preferences;
	}

	int getAppOpenedCount() {
		return preferences.getInt(APP_OPENED_COUNTER, 0);
	}

	int incrementAppOpenedCounter() {
		int count = 1 + getAppOpenedCount();
		boolean result = preferences.edit().putInt(APP_OPENED_COUNTER, count)
				.commit();
		if (!result) {
			// Log that we could not write on prefs file.
			Log.w("AppPreferencesWrapper", "Failed to write sahared pref: "
					+ APP_OPENED_COUNTER);
		}
		return getAppOpenedCount();
	}

	boolean getShouldAskToRate() {
		return preferences.getBoolean(SHOULD_ASK_TO_RATE, false);
	}

	boolean setShouldAskToRate(boolean value) {
		boolean result = preferences.edit()
				.putBoolean(SHOULD_ASK_TO_RATE, value).commit();
		if (!result) {
			// Log that we could not write on prefs file.
			Log.w("AppPreferencesWrapper", "Failed to write sahared pref: "
					+ SHOULD_ASK_TO_RATE);
		}
		return getShouldAskToRate();
	}
}
