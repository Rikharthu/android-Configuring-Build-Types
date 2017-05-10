package com.example.uberv.configuringbuildtypes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String buildInfo = String.format("Application ID: %s\nProduct Flavor: %s\nBuild Type: %s\n" +
                        "Version Name: %s\nVersion Code: %s",
                BuildConfig.APPLICATION_ID,
                BuildConfig.FLAVOR,
                BuildConfig.BUILD_TYPE,
                BuildConfig.VERSION_NAME,
                BuildConfig.VERSION_CODE);
        ((TextView) findViewById(R.id.output_textview)).setText(buildInfo);

        startActivity(new Intent(this, DebugActivity.class));
    }
}
