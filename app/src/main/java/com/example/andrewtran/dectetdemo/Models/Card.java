package com.example.andrewtran.dectetdemo.Models;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by andrewtran on 3/7/18.
 */

public interface Card {

    /* ========= V SUITS V=============*/
    @Retention(RetentionPolicy.SOURCE)
    @StringDef({MOONS, SUNS, LEAVES, WAVES, WYRMS, KNOTS})
    @interface Suit{}

    String MOONS = "moons";
    String SUNS = "suns";
    String LEAVES = "leaves";
    String WAVES = "waves";
    String WYRMS = "wyrms";
    String KNOTS = "knots";
    /* =========^ SUITS ^=============*/

    String getName();
    int getRank();
    String[] getSuits();
}
