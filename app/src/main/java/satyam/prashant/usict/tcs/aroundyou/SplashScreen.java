package satyam.prashant.usict.tcs.aroundyou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Prashant on 21-03-2017.
 */

public class SplashScreen extends Activity {
    private static int TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable()    {

            @Override
            public void run()   {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }
}
