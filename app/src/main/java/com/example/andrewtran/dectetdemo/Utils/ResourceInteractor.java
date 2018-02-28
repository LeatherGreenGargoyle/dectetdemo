package com.example.andrewtran.dectetdemo.Utils;

import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

/**
 * Created by andrewtran on 2/27/18.
 */

public interface ResourceInteractor {

    @NonNull
    String getString(@StringRes int resId, Object... formatArgs);
}
