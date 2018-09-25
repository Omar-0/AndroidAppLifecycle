package com.axiasoft.applifecyclesample;

import android.app.Application;
import android.arch.lifecycle.ProcessLifecycleOwner;

public class AppLifecycleSample extends Application {

    private AppLifecycleListener appLifecycleListener;

    @Override
    public void onCreate() {
        super.onCreate();

        appLifecycleListener = new AppLifecycleListener();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(appLifecycleListener);
    }
}
