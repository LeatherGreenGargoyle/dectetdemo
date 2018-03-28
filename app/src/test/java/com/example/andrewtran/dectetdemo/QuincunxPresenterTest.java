package com.example.andrewtran.dectetdemo;

import android.support.annotation.NonNull;

import com.example.andrewtran.dectetdemo.Games.Quincunx.QuincunxPresenter;
import com.example.andrewtran.dectetdemo.Games.Quincunx.QuincunxPresenterImpl;
import com.example.andrewtran.dectetdemo.Utils.ResourceInteractor;

import org.junit.Test;

/**
 * Created by andrewtran on 3/22/18.
 */

public class QuincunxPresenterTest {
    private String [] mCardSuits;
    private int [] mCardRanks;
    private String [] mCardNames;

    QuincunxPresenterTest() {
        super();
        mCardSuits = new String[] {"suns", "waves", "wyrms", "knots", "moons", "leaves",
                "waves_leaves", "suns_wyrms", "moons_knots", "moons_waves", "leaves_wyrms",
                "suns_knots", "moons_suns", "waves_leaves", "wyrms_knots", "wyrms_knots",
                "moons_leaves", "suns_waves", "suns_wyrms", "leaves_knots", "moons_waves",
                "waves_wyrms", "suns_knots", "moons_leaves", "moons_suns", "waves_leaves",
                "wyrms_knots", "waves_wyrms", "moons_suns", "leaves_knots", "wyrms", "leaves",
                "suns", "moons", "knots", "waves"};
        mCardRanks = new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7,
                7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 10, 10};
        mCardNames = new String[]{"Ace of Suns", "Ace of Waves", "Ace of Wyrms", "Ace of Knots",
                "Ace of Moons", "Ace of Leaves", "The Origin", "The Desert", "The Author",
                "The Journey", "The Savage", "The Painter", "The Mountain", "The Sailor", "The Battle",
                "The Soldier", "The Forest", "The Discovery", "The Penitent", "The Market",
                "The Lunatic", "The Cave", "The Castle", "The Chance Meeting", "The Diplomat",
                "The Mill", "The Betrayal", "The Darkness", "The Pact", "The Merchant",
                "The Calamity", "The End", "The Bard", "The Huntress", "The Windfall", "The Sea"};
    }

    private class MockResources implements ResourceInteractor {

        @NonNull
        @Override
        public String getString(int resId, Object... formatArgs) {
            return null;
        }

        @NonNull
        @Override
        public String[] getStringArray(int resId) {
            if (resId == R.array.card_names) {
                return mCardNames;
            } else {
                return mCardSuits;
            }
        }

        @NonNull
        @Override
        public int[] getIntArray(int resId) {
            return mCardRanks;
        }
    }

    @Test
    public void quincunxPresenter_HasCorrectStartingHandSize() {
        QuincunxPresenter aPresenter = new QuincunxPresenterImpl(new MockResources());
        aPresenter.
    }
}
