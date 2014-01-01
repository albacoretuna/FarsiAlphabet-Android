/**
 * 
 */
package com.ahuralab.farsialphabet;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Environment;
import android.view.View;

/**
 * @author panteha.s@gmail.com
 * @author michele.sama@gmail.com
 * 
 */
public class ShareScreenShot {
	
	

	public Uri saveScreenShot(Bitmap snapshot) {

		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		snapshot.compress(Bitmap.CompressFormat.JPEG, 40, bytes);

		File f = new File(Environment.getExternalStorageDirectory()
				+ File.separator + "practice.jpg");
		try {
			f.createNewFile();
			FileOutputStream fo = new FileOutputStream(f);
			fo.write(bytes.toByteArray());
			fo.flush();
			fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Uri screenshotUri = Uri.parse("file://" + f.getAbsolutePath());
		return screenshotUri;
	}

 	public Bitmap takeScreenShot(View _rootView) {
 		//if(checkCameraHardware(context)== true){
       
		Bitmap snapshot = Bitmap.createBitmap(_rootView.getWidth(),
				_rootView.getHeight(), Bitmap.Config.RGB_565);
		_rootView.draw(new Canvas(snapshot));
		return snapshot;
 		//}
 		//return null;
	}
	
	public Intent sendEmail(Uri screenshotUri){
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.setType("application/image");
		// emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new
		// String[]{strEmail});
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
				"Practice_Farsi");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
				"From My App");
		return emailIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
		
	}

}
