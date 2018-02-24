package com.example.andrewtran.dectetdemo.Models;

import android.support.annotation.NonNull;
import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by andrewtran on 2/24/18.
 *
 * Represents a single card in the game.
 *
 * Misc:
 * - TODO set up Dagger 2 so we can have a Resource interactor here that can grab string resources for the stringDef
 */

public class Card {

    private String mName;
    private String[] mSuits;
//    private int mImageId;

    public Card(@NonNull String name, @NonNull String[] suits) {
        mName = name;
        mSuits = suits;
    }

    public String[] getSuits() {
        return mSuits;
    }

    public String getName() {
        return mName;
    }

    /* ========= V SUITS V=============*/
    @Retention(RetentionPolicy.SOURCE)
    @StringDef({MOONS, SUNS, LEAVES, WAVES, WYRMS, KNOTS})
    public @interface Suit{}

    public static final String MOONS = "moons";
    public static final String SUNS = "suns";
    public static final String LEAVES = "leaves";
    public static final String WAVES = "waves";
    public static final String WYRMS = "wyrms";
    public static final String KNOTS = "knots";
    /* =========^ SUITS ^=============*/
}
