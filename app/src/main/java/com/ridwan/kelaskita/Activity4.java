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

public class Activity4 extends Activity{
    ImageButton VideoAtom, VideoAtom1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kimia);
        VideoAtom = (ImageButton)findViewById(R.id.VideoAtom);
        VideoAtom.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity4.this, ActivityAtom.class);
                startActivity(i);

            }
        });
        VideoAtom1 = (ImageButton)findViewById(R.id.VideoAtom1);
        VideoAtom1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(Activity4.this, ActivityAtomOne.class);
                startActivity(i);

            }
        });
        Log.d("Activity4", "onCreate");
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.d("ACTIVITY 4", "onStart");
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.d("ACTIVITY 4", "onPause");
    }
    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.d("ACTIVITY 4", "onresume");
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.d("ACTIVITY 4", "onDestroy");
    }
}
