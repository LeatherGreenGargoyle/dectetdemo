package com.example.andrewtran.dectetdemo;

import android.support.annotation.NonNull;

import com.example.andrewtran.dectetdemo.Utils.ResourceInteractor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andrewtran on 3/3/18.
 */

@Module
public class FoundationalTestsModule {

    @Provides
    @FoundationalTestsScope
    FoundationalTests getFoundationalTests(@NonNull ResourceInteractor resources) {
        return new FoundationalTests(resources);
    }

}
