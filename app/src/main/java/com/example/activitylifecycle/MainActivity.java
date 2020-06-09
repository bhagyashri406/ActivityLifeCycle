package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Activity1 :  onCreate", Toast.LENGTH_SHORT).show();
        Button button =(Button)findViewById(R.id.btn) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Activity2.class);
                startActivity(intent);
            }
        });

    }


    @Override
    protected void onStart() {

        Toast.makeText(MainActivity.this, "Activity1 : onStart", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(MainActivity.this, "Activity1 : onRestart", Toast.LENGTH_SHORT).show();
        super.onRestart();
    }


    @Override
    protected void onResume() {
        Toast.makeText(MainActivity.this, "Activity1 : onResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }


    @Override
    protected void onPause() {
        Toast.makeText(MainActivity.this, "Activity1 : onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }


    @Override
    protected void onStop() {
        Toast.makeText(MainActivity.this, "Activity1 : onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        Toast.makeText(MainActivity.this, "Activity1 : onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}