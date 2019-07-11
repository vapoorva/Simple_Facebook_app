package AV.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Fb extends AppCompatActivity {
    private WebView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fb);

        facebook = (WebView) findViewById(R.id.fbView);
        WebSettings wb = facebook.getSettings();
        wb.setJavaScriptEnabled(true);
        facebook.loadUrl("https://m.facebook.com/");
        facebook.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (facebook.canGoBack())
        {
            facebook.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
