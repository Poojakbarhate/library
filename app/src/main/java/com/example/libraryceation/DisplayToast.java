package com.example.libraryceation;

import static android.os.Build.VERSION_CODES.BASE;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BuildCompat;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

public class DisplayToast extends AppCompatActivity {

    public static Context context;
   public static DisplayToast mInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public DisplayToast(Context context) {
        this.context=context;
    }

    public static void display()
    {

        Toast.makeText(context,context.getResources().getString(R.string.BASE_URL), Toast.LENGTH_SHORT).show();
        //Toast toast=Toast.makeText(c,,Toast.LENGTH_SHORT);
        //toast.show();

    }
}