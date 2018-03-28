package com.example.andrewtran.dectetdemo.Models;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

/**
 * Created by andrewtran on 2/24/18.
 * Contains cards.
 *
 * TODO:
 * - Enable extended deck
 */

public class DeckImpl implements Deck {

    private ArrayDeque<CardImpl> mDeck;

    public DeckImpl(String [] cardSuits, int [] cardRanks, String [] cardNames) {
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
            CardImpl newCard = new CardImpl(cardNames[j], cardSuits[j].split("_"), cardRanks[j]);
            mDeck.add(newCard);
        }
    }

    @Nullable
    public Card drawCard() {
        if (mDeck.size() > 0) {
            return mDeck.remove();
        } else {
            return null;
        }
    }

    @Nullable
    public List<Card> drawCards(int times) {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            Card newCard = drawCard();
            if (newCard == null) {
                break;
            }
            cards.add(newCard);
        }

        return cards;
    }

    public int getDeckSize() {
        return mDeck.size();
    }
}
