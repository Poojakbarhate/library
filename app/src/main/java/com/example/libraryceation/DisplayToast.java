package com.example.libraryceation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class DisplayToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(DisplayToast.this, BuildConfig.COMMON_BASE_URL, Toast.LENGTH_SHORT).show();
    }
}