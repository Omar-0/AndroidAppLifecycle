package com.axiasoft.applifecyclesample;


import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class AppLifecycleListener implements LifecycleObserver {

    private static final String TAG_CYCLE = "Lifecycle";


    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onAppBackgrounded() {
        Log.d(TAG_CYCLE, "App is in Background");  }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onAppForegrounded() {
        Log.d(TAG_CYCLE, "App is in Foreground");
    }
}
