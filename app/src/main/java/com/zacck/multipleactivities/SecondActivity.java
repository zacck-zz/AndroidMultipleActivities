package com.zacck.multipleactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView mGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mGreeting = (TextView)findViewById(R.id.tvGreeting);

        Intent mIntent = getIntent();

        mGreeting.setText("Hello "+mIntent.getStringExtra("name")+"!");


    }
    public void goBack(View mView)
    {
        Intent firstActivityIntent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(firstActivityIntent);
    }

}
