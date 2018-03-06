package com.example.andrewtran.dectetdemo;

import android.content.Context;
import android.support.annotation.NonNull;

import com.example.andrewtran.dectetdemo.Utils.ResourceInteractor;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by andrewtran on 2/26/18.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    @NonNull
    Context getAppContext();

    @NonNull
    ResourceInteractor getResourceInteractor();
}
