package AV.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread th = new Thread()
        {
            @Override
            public void run() {
                try
                {
                    sleep(3000);//splash screen will occur on the screen for 3 secs
                }

                catch (Exception e)
                {
                    e.printStackTrace();//if any error print the exception
                }

                finally
                {//anyhow go to fb.class
                    Intent intent = new Intent(SplashScreen.this,Fb.class);
                    startActivity(intent);
                }
            }
        };
        th.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
