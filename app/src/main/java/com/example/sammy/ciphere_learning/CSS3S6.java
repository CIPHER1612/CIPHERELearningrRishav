package com.example.sammy.ciphere_learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CSS3S6 extends AppCompatActivity {

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
        setContentView(R.layout.activity_css3_s6);
        css1c1t1=(WebView) findViewById(R.id.css1s1c1);
        css1c1t1.getSettings().setJavaScriptEnabled(true);
        css1c1t1.setFocusable(true);
        css1c1t1.setFocusableInTouchMode(true);
        css1c1t1.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        css1c1t1.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        css1c1t1.getSettings().setDomStorageEnabled(true);
        css1c1t1.getSettings().setDatabaseEnabled(true);
        css1c1t1.getSettings().setAppCacheEnabled(true);
        css1c1t1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        css1c1t1.loadUrl("https://drive.google.com/open?id=1fPjz9IvC_2hjpu-cn2BTfhTQPWFiIAMS");
        css1c1t1.setWebViewClient(new WebViewClient());
    }
}
