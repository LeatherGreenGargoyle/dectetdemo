package com.example.andrewtran.dectetdemo.Models;

import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by andrewtran on 3/7/18.
 */

public interface Deck {

    @Nullable
    Card drawCard();

    @Nullable
    List<Card> drawCards(int times);

    int getDeckSize();
}
