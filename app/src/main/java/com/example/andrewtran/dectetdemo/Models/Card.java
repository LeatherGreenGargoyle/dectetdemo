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
 */

public class Card {

    private String mName;
    private String[] mSuits;
    private int mRank;
//    private int mImageId;

    public Card(@NonNull String name, @NonNull String[] suits, @NonNull int rank) {
        mName = name;
        mSuits = suits;
        mRank = rank;
    }

    public String getName() {
        return mName;
    }

    public int getRank() {
        return mRank;
    }

    public String[] getSuits() {
        return mSuits;
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
