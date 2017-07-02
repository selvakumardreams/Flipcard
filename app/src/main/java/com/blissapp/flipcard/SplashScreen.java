package com.blissapp.flipcard;

/**
 * Created by m1013673 on 8/2/17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Created by m1013673 on 3/1/17.
 */

//keytool -exportcert -list -v -alias androiddebugkey -keystore %USERPROFILE%\.android\debug.keystore
    //keytool -v -keystore my-release-key.keystore -list

public class SplashScreen extends BaseActivity {
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_splash);

        //   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //  setSupportActionBar(toolbar);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {

                startActivity(new Intent(SplashScreen.this, WelcomeActivity.class));
                finish();

            }
        }, SPLASH_TIME_OUT);
    }

}