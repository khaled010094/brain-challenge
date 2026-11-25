package com.brainchallenge.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.view.View;

public class MainActivity extends Activity {
    private WebView webView;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(0xFF101B35);
        getWindow().setNavigationBarColor(0xFF101B35);
        webView = new WebView(this);
        setContentView(webView);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setAllowFileAccess(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        webView.setWebViewClient(new WebViewClient() {
            @Override public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                String css = "body{background:#101b35 url('file:///android_asset/mariam_background.webp') center center / cover fixed no-repeat !important;}" +
                    "body::before{content:'';position:fixed;inset:0;background:linear-gradient(rgba(7,15,35,.55),rgba(7,15,35,.78));pointer-events:none;z-index:-1;}" +
                    ".app{background:transparent !important;position:relative;z-index:0;}" +
                    ".card{background:rgba(27,42,75,.82) !important;backdrop-filter:blur(2px);}";
                view.evaluateJavascript("(function(){var s=document.createElement('style');s.textContent=" +
                    "'" + css.replace("\\", "\\\\").replace("'", "\\'") + "';" +
                    "document.head.appendChild(s);})();", null);
            }
        });
        webView.setWebChromeClient(new WebChromeClient());
        webView.setOverScrollMode(View.OVER_SCROLL_NEVER);
        webView.loadUrl("file:///android_asset/index.html");
    }

    @Override public void onBackPressed() {
        if (webView != null && webView.canGoBack()) webView.goBack();
        else super.onBackPressed();
    }

    @Override protected void onDestroy() {
        if (webView != null) { webView.destroy(); webView = null; }
        super.onDestroy();
    }
}
