package com.example.andrewtran.dectetdemo.Models;

/**
 * Created by andrewtran on 3/7/18.
 */

public interface Deck {

    CardImpl drawCard();
    int getDeckSize();
}
