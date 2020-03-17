package com.usetime.toast_style_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.usetime.lib_toaststyle.Toast_style;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast_style style = new Toast_style(MainActivity.this);
        style.ShowSimpleToast("Example toast");

        style.DarkToast("Dark Toast");
    }
}
