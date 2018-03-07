package com.example.andrewtran.dectetdemo.Models;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

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

    private ArrayDeque<Card> mDeck;

    public Deck(String [] cardSuits, int [] cardRanks, String [] cardNames) {
        mDeck = new ArrayDeque<>();
        String [] shuffledCardNames = Arrays.copyOf(cardNames, cardNames.length);
        Random random = new Random();
        Collections.shuffle(Arrays.asList(shuffledCardNames));

        for (int i = 0; i < cardNames.length; i++) {
            int randomIdx = i + random.nextInt(cardNames.length - i);
            String tempName = cardNames[i];
            int tempRank = cardRanks[i];
            String tempSuits = cardSuits[i];

            cardNames[i] = cardNames[randomIdx];
            cardRanks[i] = cardRanks[randomIdx];
            cardSuits[i] = cardSuits[randomIdx];

            cardNames[randomIdx] = tempName;
            cardRanks[randomIdx] = tempRank;
            cardSuits[randomIdx] = tempSuits;
        }

        for (int j = 0; j < cardNames.length; j++) {
            Card newCard = new Card(cardNames[j], cardSuits[j].split("_"), cardRanks[j]);
            mDeck.add(newCard);
        }
    }

    public Card drawCard() {
        return mDeck.remove();
    }

    public int getDeckSize() {
        return mDeck.size();
    }
}
