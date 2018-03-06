package com.example.andrewtran.dectetdemo.Models;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by andrewtran on 2/24/18.
 * Contains cards.
 *
 * TODO:
 * - Enable extended deck
 *
 * Attributes:
 * - Has a current size
 * - Method to return a random card
 * - Method to shuffle
 * - Has randomized card ordering on every instantiation
 *
 * Impl:
 * - How to organize card data?
 */

public class Deck {

    private Card [] mDeck;

    public Deck(String [] cardSuits, int [] cardRanks, String [] cardNames) {
        mDeck = new Card[36];
        String [] shuffledCardNames = Arrays.copyOf(cardNames, cardNames.length);
        Collections.shuffle(Arrays.asList(shuffledCardNames));

        for (String cardName : shuffledCardNames) {
            int idx = Arrays.asList(cardNames).indexOf(cardName);
            String[] suits = cardSuits[idx].split("_");
            Card newCard = new Card(cardName, suits, cardRanks[idx]);
            mDeck[idx] = newCard;
        }
    }

    public int getDeckSize() {
        return mDeck.length;
    }
}
