package com.example.andrewtran.dectetdemo;

import android.app.Application;
import android.support.annotation.NonNull;

/**
 * Created by andrewtran on 2/26/18.
 */

public class MainApp extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @NonNull
    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
