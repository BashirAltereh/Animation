package com.example.bashir.animation;

import android.app.Application;

public class MyApplication extends Application {
    private static MyApplication mInstanse;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstanse = this;
    }
    public static synchronized  MyApplication getmInstanse(){
        return mInstanse;
    }

    public void setConnectiviyListener(Connectivi)

}
