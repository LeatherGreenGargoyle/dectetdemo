package com.example.andrewtran.dectetdemo.Utils;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;

/**
 * Created by andrewtran on 2/27/18.
 */

public class ResourceInteractorImpl implements ResourceInteractor {

    @NonNull
    private final Resources mResources;

    public ResourceInteractorImpl(@NonNull Context context) {
        this.mResources = context.getResources();
    }

    @NonNull
    @Override
    public String getString(int resId, Object... formatArgs) {
        return mResources.getString(resId, formatArgs);
    }
}
