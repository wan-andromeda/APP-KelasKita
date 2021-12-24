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

public class MainActivity extends Activity {

        ImageButton imageButtonMat, imageButtonFis, imageButtonKim, imageButtonBio;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            imageButtonBio = (ImageButton) findViewById(R.id.imageButtonBio);
            imageButtonBio.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    Intent i = new Intent(MainActivity.this, Activity2.class);
                    startActivity(i);
                }
            });
            imageButtonFis = (ImageButton)findViewById(R.id.imageButtonFis);
            imageButtonFis.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    Intent i = new Intent(MainActivity.this, Activity3.class);
                    startActivity(i);
                }
            });
            imageButtonKim = (ImageButton)findViewById(R.id.imageButtonKim);
            imageButtonKim.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    Intent i = new Intent(MainActivity.this, Activity4.class);
                    startActivity(i);
                }
            });
            imageButtonMat = (ImageButton)findViewById(R.id.imageButtonMat);
            imageButtonMat.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    Intent i = new Intent(MainActivity.this, Activity5.class);
                    startActivity(i);
                }
            });

            Log.d("ACTIVITY 1", "onCreate");
        }
        @Override
        protected void onStart() {
            // TODO Auto-generated method stub
            super.onStart();
            Log.d("ACTIVITY 1", "onStart");
        }
        @Override
        protected void onPause() {
            // TODO Auto-generated method stub
            super.onPause();
            Log.d("ACTIVITY 1", "onPause");
        }
        @Override
        protected void onResume() {
            // TODO Auto-generated method stub
            super.onResume();
            Log.d("ACTIVITY 1", "onresume");
        }
        @Override
        protected void onDestroy() {
            // TODO Auto-generated method stub
            super.onDestroy();
            Log.d("ACTIVITY 1", "onDestroy");
        }


    }