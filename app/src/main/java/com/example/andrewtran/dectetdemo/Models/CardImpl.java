package com.example.andrewtran.dectetdemo.Models;

import android.support.annotation.NonNull;

/**
 * Created by andrewtran on 2/24/18.
 *
 * Represents a single card in the game.
 *
 */

public class CardImpl implements Card {

    private String mName;
    private String[] mSuits;
    private int mRank;

    public CardImpl(@NonNull String name, @NonNull String[] suits, @NonNull int rank) {
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
}
