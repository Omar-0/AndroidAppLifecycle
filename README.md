# AndroidAppLifecycle
Example: Detect when an Android app goes to the background and foreground. Using lifecycle components with java (android.arch.lifecycle)

Using Java as base language.

Quick Tutorial

1. Add dependencies

        implementation 'android.arch.lifecycle:extensions:1.1.1'
        
        annotationProcessor 'android.arch.lifecycle:compiler:1.1.1'

2. Create a LifecycleObserver class and override methods to manage foreground and background events on the app.

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

3. Initialize LifecycleObserver and add Observer in your Application class.

        appLifecycleListener = new AppLifecycleListener();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(appLifecycleListener);


source and documents: 

https://android-developers.googleblog.com/2017/05/android-and-architecture.html

