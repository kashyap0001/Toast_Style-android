package com.usetime.lib_toaststyle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Toast_style {

    Context c ;
    public Toast_style(Context c){
        this.c = c;
    }

    public void ShowSimpleToast(String text){
        Toast.makeText(c, text, Toast.LENGTH_SHORT).show();
    }

    public void DarkToast(String text){

        LayoutInflater inflater = LayoutInflater.from(c);
        View v = inflater.inflate(R.layout.dark_toast,null);



        TextView tv = v.findViewById(R.id.tv);
        tv.setText(text);

        Toast t = new Toast(c);
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(v);
        t.setGravity(Gravity.BOTTOM,0,30);
        t.show();

    }
}
