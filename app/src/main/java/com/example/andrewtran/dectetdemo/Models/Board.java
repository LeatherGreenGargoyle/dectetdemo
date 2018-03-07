package com.example.andrewtran.dectetdemo.Models;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by andrewtran on 2/24/18.
 * Playing field for a particular game
 */

public class Board {

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({UPRIGHT, POINTRIGHT, UPSIDEDOWN, POINTLEFT})
    public @interface Orientation{}

    public static final int UPRIGHT = 0;
    public static final int POINTRIGHT = 1;
    public static final int UPSIDEDOWN = 2;
    public static final int POINTLEFT = 3;
}
