package com.ridwan.kelaskita;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityUsaha extends Activity {
    WebView vid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usaha);
    }
}
