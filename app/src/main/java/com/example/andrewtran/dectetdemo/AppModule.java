package com.example.andrewtran.dectetdemo;

import android.content.Context;
import android.support.annotation.NonNull;

import com.example.andrewtran.dectetdemo.Utils.ResourceInteractor;
import com.example.andrewtran.dectetdemo.Utils.ResourceInteractorImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andrewtran on 2/26/18.
 */

@Module
class AppModule {

    @NonNull
    private final Context mContext;

    AppModule(@NonNull MainApp app) {
        this.mContext = app.getApplicationContext();
    }

    @Provides
    Context provideAppContext() {
        return mContext;
    }

    @Provides
    ResourceInteractor provideResources() {
        return new ResourceInteractorImpl(mContext);
    }
}
