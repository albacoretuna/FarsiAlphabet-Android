/**
 * 
 */
package com.ahuralab.farsialphabet;

import java.util.List;

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
	
	private final List<LetterItem> items;

	public LetterListAdapter(Context context) {
		this.context = context; 
		items = LetterItem.createFarsi();
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
		
		TextView isolatedView = ((TextView) letterView.findViewById(R.id.letterIsolated));
		isolatedView.setText(item.isolated);
		// Add sound
		isolatedView.setOnClickListener(new PlayOnceOnCLickListener(context, item));
				
        TextView beginView = ((TextView) letterView.findViewById(R.id.letterBegin));
        beginView.setText(item.begin);
        beginView.setOnClickListener(new DravingOnClickListener(context, beginView.getText().toString()));
        
        TextView middleView = ((TextView) letterView.findViewById(R.id.letterMiddle));
        middleView.setText(item.middle);
        middleView.setOnClickListener(new DravingOnClickListener(context, middleView.getText().toString()));
        
        TextView endView = ((TextView) letterView.findViewById(R.id.letterEnd));
        endView.setText(item.end);
        endView.setOnClickListener(new DravingOnClickListener(context, endView.getText().toString()));
        
		return letterView;
	}

	@Override
	public int getCount() {
		return items.size();
	}


	@Override
	public Object getItem(int position) {
		return items.get(position);
	}


	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	
    /**
     * Play a sound if not already playing.
     */
    private static class PlayOnceOnCLickListener implements View.OnClickListener {

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
				final MediaPlayer mp = MediaPlayer.create(context, letter.soundId);
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

    private static class DravingOnClickListener implements View.OnClickListener {
    	
    	private final Context context;
    	private final String letter;
		
    	public DravingOnClickListener(Context context, String letter) {
			this.context = context;
			this.letter = letter;
		}
		
    	@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, LetterCanvasActivity.class);
			intent.putExtra(LetterCanvasActivity.LETTER_INTENT_EXTRA, letter);
			context.startActivity(intent);
		}
    	
    }
}
