package com.example.trymap;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Thread logotimer = new Thread(){
			public void run(){
				try{
					sleep(5000);
					Intent mainIntent = new Intent("com.example.trymap.SplashActivity");
					startActivity(mainIntent);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					finish();
					
				}
			}
		};
		
		logotimer.start();
	}

}
