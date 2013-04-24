package com.monsterapps.cprograms;

import java.io.IOException;
import java.io.InputStream;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ProgramContent extends ProgramList{
	
	TextView txtContent;
	TextView txtFileName;
	
	
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.progdisplay);
		
		txtContent = (TextView) findViewById(R.id.tvdisp);
		txtFileName = (TextView) findViewById(R.id.fileName);
		Typeface type = Typeface.createFromAsset(getAssets(),"fonts/comic.ttf"); 
		txtContent.setTypeface(type);
		
		
final AssetManager assetManager = getAssets();

		
		
		// To get names of all files inside the "Files" folder
					try {
						String[] files = assetManager.list("Files");
						
						for(int i=0; i<files.length; i++)
						{
							txtFileName.append("\n File :"+i+" Name => "+files[i]);
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					// To load text file
				    InputStream input;
					try {
						input = assetManager.open(fName);
						
				         int size = input.available();
				         byte[] buffer = new byte[size];
				         input.read(buffer);
				         input.close();

				         // byte buffer into a string
				         String text = new String(buffer,"UTF-8");
				         
				         //To make TextView  Scroll
				         txtContent.setMovementMethod(new ScrollingMovementMethod());
				         txtContent.setText(text);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

		
		
		
	}

}
