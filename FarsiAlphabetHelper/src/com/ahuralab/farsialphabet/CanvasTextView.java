/**
 * 
 */
package com.ahuralab.farsialphabet;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * A text view on top of which users can sketch.
 * 
 * 
 * @author msama (michele.sama@gmail.com)
 * @author psaeedi (panteha.s@gmail.com)
 * 
 */
public class CanvasTextView extends TextView {

	private List<Path> strokes = new ArrayList<Path>();
	private Paint paint;
	private Path currentPath;
	
	Path middleLine;
	Paint whitePaint;

	public CanvasTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initialize(context);
	}

	public CanvasTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initialize(context);
	}

	public CanvasTextView(Context context) {
		super(context);
		initialize(context);
	}

	private void initialize(Context context) {
		paint = new Paint();
		paint.setDither(true);
		paint.setColor(Color.argb(220, 51, 181, 229));
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeJoin(Paint.Join.MITER);
		paint.setStrokeCap(Paint.Cap.ROUND);
		paint.setStrokeWidth(30);
		
		// middle line
		middleLine = new Path();
		middleLine.moveTo(0, getHeight() / 2);
		middleLine.lineTo(getWidth(), getHeight() / 2);
		whitePaint = new Paint();
		whitePaint.setColor(Color.WHITE);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			// Discard any existing paths
			currentPath = new Path();
			currentPath.moveTo(event.getX(), event.getY());
			currentPath.lineTo(event.getX(), event.getY());
		} else if (event.getAction() == MotionEvent.ACTION_MOVE) {
			if (currentPath == null) {
				throw new RuntimeException("Path should not be null");
			}
			currentPath.lineTo(event.getX(), event.getY());
		} else if (event.getAction() == MotionEvent.ACTION_UP) {
			currentPath.lineTo(event.getX(), event.getY());
			strokes.add(currentPath);
			currentPath = null;
		}
		invalidate();
		return true;

	}

	@Override
	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawPath(middleLine, whitePaint);
		for (Path path : strokes) {
			// canvas.drawPoint(graphic.x, graphic.y, paint);
			canvas.drawPath(path, paint);
		}
		// Also draw the current line
		if (currentPath != null) {
			canvas.drawPath(currentPath, paint);
		}
	}

	public void resetCanvas() {
		strokes = new ArrayList<Path>();
		invalidate();
	}
}
