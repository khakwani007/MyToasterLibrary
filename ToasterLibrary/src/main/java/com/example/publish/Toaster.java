package com.example.publish;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void toast(Context context,String message){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show();

    }
    public static double add(double a,double b){
        double sum=a+b;
        return sum ;
    }
}
