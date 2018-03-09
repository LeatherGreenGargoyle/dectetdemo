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

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({THE_AUTHOR, THE_PAINTER, THE_SAVAGE, THE_SAILOR, THE_SOLDIER, THE_LUNATIC,
            THE_PENITENT, THE_DIPLOMAT, THE_MERCHANT, THE_BARD, THE_HUNTRESS})
            @interface Personality{}
    String THE_AUTHOR = "The Author";
    String THE_PAINTER = "The Painter";
    String THE_SAVAGE = "The Savage";
    String THE_SAILOR = "The Sailor";
    String THE_SOLDIER = "The Soldier";
    String THE_LUNATIC = "The Lunatic";
    String THE_PENITENT = "The Penitent";
    String THE_DIPLOMAT = "The Diplomat";
    String THE_MERCHANT = "The Merchant";
    String THE_BARD = "The Bard";
    String THE_HUNTRESS = "The Huntress";

    String getName();
    int getRank();
    String[] getSuits();
}
