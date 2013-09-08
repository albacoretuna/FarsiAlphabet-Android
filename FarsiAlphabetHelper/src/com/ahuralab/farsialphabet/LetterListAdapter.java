/**
 * 
 */
package com.ahuralab.farsialphabet;

import com.ahuralab.farsifragment.R;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * @author michele.sama@gmail.com
 * @author panteha.s@gmail.com
 * 
 */
public class LetterListAdapter extends BaseAdapter {

	private final Context context;
	private final LetterItem[] items;

	public LetterListAdapter(Context context) {
		this.context = context;
		items = LetterItem.FARSI;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final LetterItem item = (LetterItem) getItem(position);

		View letterView = null;
		if (convertView == null) {
			LayoutInflater li = LayoutInflater.from(context);
			letterView = li.inflate(R.layout.list_row_layout, null);
		} else {
			// Reuse
			letterView = convertView;
		}

		((TextView) letterView.findViewById(R.id.letterName))
				.setText(item.name);

		TextView isolatedView = ((TextView) letterView
				.findViewById(R.id.letterIsolated));
		isolatedView.setText(item.isolated);
		// Add sound
		isolatedView.setOnClickListener(new PlayOnceOnCLickListener(context,
				item));

		TextView beginView = ((TextView) letterView
				.findViewById(R.id.letterBegin));
		beginView.setText(item.begin);
		beginView.setOnClickListener(new DrawingOnClickListener(context, item,
				LetterPracticeActivity.BEGIN));

		TextView middleView = ((TextView) letterView
				.findViewById(R.id.letterMiddle));
		middleView.setText(item.middle);
		middleView.setOnClickListener(new DrawingOnClickListener(context, item,
				LetterPracticeActivity.MIDDLE));

		TextView endView = ((TextView) letterView.findViewById(R.id.letterEnd));
		endView.setText(item.end);
		endView.setOnClickListener(new DrawingOnClickListener(context, item,
				LetterPracticeActivity.END));

		return letterView;
	}

	@Override
	public int getCount() {
		return items.length;
	}

	@Override
	public Object getItem(int position) {
		return items[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Play a sound if not already playing.
	 */
	private static class PlayOnceOnCLickListener implements
			View.OnClickListener {

		private volatile boolean playing = false;
		private final Context context;
		private final LetterItem letter;

		public PlayOnceOnCLickListener(Context context, LetterItem letter) {
			this.context = context;
			this.letter = letter;
		}

		@Override
		public void onClick(View v) {
			if (playing == false) {
				playing = true;
				final MediaPlayer mp = MediaPlayer.create(context,
						letter.soundId);
				mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
					@Override
					public void onCompletion(MediaPlayer mp) {
						mp.release();
						playing = false;
					}
				});
				mp.start();
			}
		}

	}

	private static class DrawingOnClickListener implements View.OnClickListener {

		private final Context context;
		private final LetterItem letterItem;
		private final int startIndex;

		public DrawingOnClickListener(Context context, LetterItem letterItem,
				int startIndex) {
			this.context = context;
			this.letterItem = letterItem;
			this.startIndex = startIndex;
		}

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, LetterPracticeActivity.class);
			intent.putExtra(LetterPracticeActivity.LETTER_INTENT_EXTRA,
					letterItem);
			intent.putExtra(LetterPracticeActivity.INDEX_INTENT_EXTRA,
					startIndex);
			context.startActivity(intent);
		}

	}
}
