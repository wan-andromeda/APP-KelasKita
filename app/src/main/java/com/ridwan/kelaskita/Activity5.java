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

public class Activity5 extends Activity{
    ImageButton VideoIntegral, VideoPitagoras, VideoIntegral1, VideoPitagoras1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matematika);
        VideoIntegral = (ImageButton) findViewById(R.id.VideoIntegral);
        VideoIntegral.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity5.this, ActivityIntegral.class);
                startActivity(i);
            }
        });
        VideoPitagoras = (ImageButton)findViewById(R.id.VideoPitagoras);
        VideoPitagoras.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity5.this, ActivityPitagoras.class);
                startActivity(i);
            }
        });
        VideoIntegral1 = (ImageButton) findViewById(R.id.VideoIntegral1);
        VideoIntegral1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity5.this, ActivityIntegralOne.class);
                startActivity(i);
            }
        });
        VideoPitagoras1 = (ImageButton)findViewById(R.id.VideoPitagoras1);
        VideoPitagoras1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity5.this, ActivityPitaOne.class);
                startActivity(i);
            }
        });
        Log.d("Activity5", "onCreate");
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.d("ACTIVITY 5", "onStart");
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.d("ACTIVITY 5", "onPause");
    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.d("ACTIVITY 5", "onresume");
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.d("ACTIVITY 5", "onDestroy");
    }
}
