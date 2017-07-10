package com.otamate.android.things.atpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    protected View mMainActivityView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mMainActivityView = LayoutInflater.from( this ).inflate( R.layout.activity_main, null );

        Button prefsButton = (Button) mMainActivityView.findViewById(R.id.button);

        prefsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PrefActivity.class);
                startActivity(i);
            }
        });

        setContentView(mMainActivityView);
    }
}
