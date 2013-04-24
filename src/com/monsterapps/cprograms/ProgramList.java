package com.monsterapps.cprograms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ProgramList extends Activity{
	String fName="prog1.txt";
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.plist);
		
		
		TextView t1 = (TextView)findViewById(R.id.prog1);
		t1.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog1.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t2 = (TextView)findViewById(R.id.prog2);
		t2.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog2.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t3 = (TextView)findViewById(R.id.prog3);
		t3.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog3.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t4 = (TextView)findViewById(R.id.prog4);
		t4.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog4.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t5 = (TextView)findViewById(R.id.prog5);
		t5.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog5.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t6 = (TextView)findViewById(R.id.prog6);
		t6.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog6.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t7 = (TextView)findViewById(R.id.prog7);
		t7.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog7.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t8 = (TextView)findViewById(R.id.prog8);
		t8.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog8.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t9 = (TextView)findViewById(R.id.prog9);
		t9.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog9.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t10 = (TextView)findViewById(R.id.prog10);
		t10.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog10.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t11 = (TextView)findViewById(R.id.prog11);
		t11.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog11.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t12 = (TextView)findViewById(R.id.prog12);
		t12.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog12.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t13 = (TextView)findViewById(R.id.prog13);
		t13.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog13.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t14 = (TextView)findViewById(R.id.prog14);
		t14.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog14.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		TextView t15 = (TextView)findViewById(R.id.prog15);
		t15.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				fName="prog15.txt";
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				startActivity(new Intent(ProgramList.this,ProgramContent.class));
			}
		});
		
	}

}
