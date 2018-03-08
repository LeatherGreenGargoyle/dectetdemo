package com.example.andrewtran.dectetdemo.Models;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by andrewtran on 2/24/18.
 * Playing field for a particular game
 */

public interface Board {

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({UPRIGHT, POINTRIGHT, UPSIDEDOWN, POINTLEFT})
    @interface Orientation{}

    int UPRIGHT = 0;
    int POINTRIGHT = 1;
    int UPSIDEDOWN = 2;
    int POINTLEFT = 3;
}
