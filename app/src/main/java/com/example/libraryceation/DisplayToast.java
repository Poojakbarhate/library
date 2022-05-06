package com.example.libraryceation;

import static android.os.Build.VERSION_CODES.BASE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BuildCompat;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

public class DisplayToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(DisplayToast.this);
    }
    public void display(Context c) {
        Toast.makeText(c,Constants.BASE_URL, Toast.LENGTH_SHORT).show();

    }
}