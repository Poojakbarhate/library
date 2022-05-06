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

        Toast.makeText(this,Constants.BASE_URL, Toast.LENGTH_SHORT).show();
        Toast toast=Toast.makeText(getApplicationContext(),Constants.BASE_URL,Toast.LENGTH_SHORT);
        toast.show();

    }
}