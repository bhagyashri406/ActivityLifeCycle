package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Toast.makeText(Activity2.this, "Activity2 :  onCreate", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {

        Toast.makeText(Activity2.this, "Activity2 : onStart", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(Activity2.this, "Activity2 : onRestart", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }


    @Override
    protected void onResume() {
        Toast.makeText(Activity2.this, "Activity2 : onResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(Activity2.this, "Activity2 : onBackPressed", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        Toast.makeText(Activity2.this, "Activity2 : onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }


    @Override
    protected void onStop() {
        Toast.makeText(Activity2.this, "Activity2 : onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        Toast.makeText(Activity2.this, " Activity2 : onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}