package com.example.dione.eperpus_almusda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.Webview;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    webView = webviewku;
    WebSettings = WebSettingku;
    webView.loadUrl("https://eperpus.ma-almusda.sch.id");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webviewku = (WebView)findViewById(R.id.WebView1);
        WebSettingku = Webviewku.getSettings();
        WebViewku.SetWebViewClient(new WebViewClient());
        WebViewku.loadUrl("https://eperpus/ma-almusda.sch.id/");
    }
}
