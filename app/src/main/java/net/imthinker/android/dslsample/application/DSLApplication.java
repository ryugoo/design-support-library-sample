package net.imthinker.android.dslsample.application;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class DSLApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
