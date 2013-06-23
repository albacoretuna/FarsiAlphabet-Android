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
	
	public static final String LETTER_MIDDLE = "middle";
	public static final String LETTER_BEGIN = "begin";
	public static final String LETTER_END = "end";

	private final Context context;
	
	private final List<LetterItem> items;
	private final List<WordItem> exampleItems;

	public LetterListAdapter(Context context) {
		this.context = context; 
		items = LetterItem.createFarsi();
		exampleItems = WordItem.createFarsiRelatedWords();
    }

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final LetterItem item = (LetterItem) getItem(position);
		final WordItem  wordItem = (WordItem) getItem(position);
		
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
        String [] infoLetterBegin = {beginView.getText().toString(), LETTER_BEGIN, wordItem.beginFarsi, wordItem.beginEnglish};
        beginView.setOnClickListener(new DrawingOnClickListener(context, infoLetterBegin ));
        
        TextView middleView = ((TextView) letterView.findViewById(R.id.letterMiddle));
        middleView.setText(item.middle);
        String [] infoLetterMiddle = {middleView.getText().toString(), LETTER_MIDDLE, wordItem.middleFarsi, wordItem.middleEnglis};
        middleView.setOnClickListener(new DrawingOnClickListener(context, infoLetterMiddle));
        
        TextView endView = ((TextView) letterView.findViewById(R.id.letterEnd));
        endView.setText(item.end);
        String [] infoLetterEnd = {endView.getText().toString(), LETTER_END, wordItem.endFarsi, wordItem.endEnglish};
        endView.setOnClickListener(new DrawingOnClickListener(context, infoLetterEnd));
        
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

    private static class DrawingOnClickListener implements View.OnClickListener {
    	
    	private final Context context;
    	private final String[] infoLetter ;
		
    	public DrawingOnClickListener(Context context, String[] infoLetter) {
			this.context = context;
			this.infoLetter = infoLetter;
		}
    	
    	
    	@Override
		public void onClick(View v) {
			Intent intent = new Intent(context, LetterCanvasActivity.class);
			intent.putExtra(LetterCanvasActivity.LETTER_INTENT_EXTRA, infoLetter);
			context.startActivity(intent);
		}
    	
    }
}
