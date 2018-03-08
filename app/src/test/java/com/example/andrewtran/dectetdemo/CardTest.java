package com.example.andrewtran.dectetdemo;

import com.example.andrewtran.dectetdemo.Models.Card;

import org.junit.Test;

import static com.example.andrewtran.dectetdemo.Models.Card.MOONS;
import static com.example.andrewtran.dectetdemo.Models.Card.WAVES;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by andrewtran on 3/7/18.
 *
 * Tests for class Card
 */

public class CardTest {

    @Test
    public void getName_returnsNonEmptyString() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits, 6);
        String cardName = card.getName();

        assertNotNull("Expected card name to be non-null", cardName);
        assertNotEquals(cardName.length(), 0);
    }

    @Test
    public void getRank_returnsANumber() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits, 6);
        int cardRank = card.getRank();

        assertNotNull("Expected card rank to be non-null", card.getRank());
        assertTrue(cardRank > 0);
        assertTrue(cardRank < 11);
    }

    @Test
    public void getSuits_returnsANumber() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits, 6);
        String[] cardSuits = card.getSuits();

        assertNotNull("Expected card suits to be non-null", cardSuits);
        assertTrue(cardSuits.length > 0);
        assertTrue(cardSuits.length < 3);
    }
}
