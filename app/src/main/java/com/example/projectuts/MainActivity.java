package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleRM(View view) {
        Intent intent = new Intent(this, RMActivity.class);
        startActivity(intent);
    }

    public void handleCFC(View view) {
        Intent intent = new Intent(this, CFCActivity.class);
        startActivity(intent);
    }

    public void handleFCB(View view) {
        Intent intent = new Intent(this, FCBActivity.class);
        startActivity(intent);
    }

    public void handleArema(View view) {
        Intent intent = new Intent(this, AremaActivity.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish();
    }
}
