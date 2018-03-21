package com.example.andrewtran.dectetdemo.Games.Quincunx;

import android.support.annotation.NonNull;

import com.example.andrewtran.dectetdemo.Utils.ResourceInteractor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andrewtran on 3/20/18.
 *
 * Module for Quincunx Dagger functionality.
 */

@Module
class QuincunxModule {

    @Provides
    @QuincunxScope
    QuincunxPresenter provideQuincunxPresenter(@NonNull ResourceInteractor resources) {
        return new QuincunxPresenterImpl(resources);
    }
}
