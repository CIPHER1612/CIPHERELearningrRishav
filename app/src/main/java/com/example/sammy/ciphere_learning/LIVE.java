package com.example.sammy.ciphere_learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LIVE extends AppCompatActivity {
    WebView css1c1t1;

    @Override
    public void onBackPressed(){
        if(css1c1t1.canGoBack()){
            css1c1t1.goBack();
        }else{
            super.onBackPressed();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);
        css1c1t1=(WebView) findViewById(R.id.liveweb);
        css1c1t1.getSettings().setJavaScriptEnabled(true);
        css1c1t1.setFocusable(true);
        css1c1t1.setFocusableInTouchMode(true);
        css1c1t1.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        css1c1t1.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        css1c1t1.getSettings().setDomStorageEnabled(true);
        css1c1t1.getSettings().setDatabaseEnabled(true);
        css1c1t1.getSettings().setAppCacheEnabled(true);
        css1c1t1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        css1c1t1.loadUrl("http://www.youtube.com/user/scofodboys/live");
        css1c1t1.setWebViewClient(new WebViewClient());
    }
}