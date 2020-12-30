package com.example.superman.app;

import android.app.Application;

public class Myapp extends Application {
    public static Myapp app;
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }


}
