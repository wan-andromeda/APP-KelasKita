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

public class Activity2 extends Activity{
    ImageButton VideoBakteri, VideoVirus ,VideoBakteri1, VideoVirus1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biologi);

        VideoBakteri1 = (ImageButton)findViewById(R.id.videobakteri1);
        VideoBakteri1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity2.this, ActivityBakteri.class);
                startActivity(i);
            }
        });
        VideoVirus1 = (ImageButton)findViewById(R.id.VideoVirus1);
        VideoVirus1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity2.this, ActivityVirus.class);
                startActivity(i);
            }
        });
        VideoBakteri = (ImageButton)findViewById(R.id.VideoBakteri);
        VideoBakteri.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity2.this, ActivityBakteriOne.class);
                startActivity(i);
            }
        });
        VideoVirus = (ImageButton)findViewById(R.id.VideoVirus);
        VideoVirus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity2.this, ActivityVirusOne.class);
                startActivity(i);
            }
        });

        Log.d("Activity2", "onCreate");
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.d("ACTIVITY 2", "onStart");
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.d("ACTIVITY 2", "onPause");
    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.d("ACTIVITY 2", "onresume");
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.d("ACTIVITY 2", "onDestroy");
    }
}

