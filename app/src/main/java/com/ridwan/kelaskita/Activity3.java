package com.ridwan.kelaskita;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class Activity3 extends Activity{
    ImageButton VideoGerak, VideoUsaha, VideoGerak1, VideoUsaha1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fisika);
        VideoGerak1 = (ImageButton)findViewById(R.id.VideoGerak1);
        VideoGerak1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity3.this, ActivityKinematik.class);
                startActivity(i);

            }
        });
        VideoUsaha1 = (ImageButton)findViewById(R.id.VideoUsaha1);
        VideoUsaha1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity3.this, ActivityUsaha.class);
                startActivity(i);

            }
        });
        VideoGerak = (ImageButton)findViewById(R.id.VideoGerak);
        VideoGerak.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity3.this, ActivityGerakOne.class);
                startActivity(i);

            }
        });
        VideoUsaha = (ImageButton)findViewById(R.id.VideoUsaha);
        VideoUsaha.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity3.this, ActivityUsahaOne.class);
                startActivity(i);

            }
        });


        Log.d("Activity3", "onCreate");
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.d("ACTIVITY 3", "onStart");
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.d("ACTIVITY 3", "onPause");
    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.d("ACTIVITY 3", "onresume");
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.d("ACTIVITY 3", "onDestroy");
    }
}
