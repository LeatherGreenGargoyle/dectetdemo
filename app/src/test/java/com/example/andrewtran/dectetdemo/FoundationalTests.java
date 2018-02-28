package com.example.andrewtran.dectetdemo;

import com.example.andrewtran.dectetdemo.Models.Card;
import com.example.andrewtran.dectetdemo.Models.Deck;

import org.junit.Test;

import static com.example.andrewtran.dectetdemo.Models.Card.MOONS;
import static com.example.andrewtran.dectetdemo.Models.Card.WAVES;
import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by andrewtran on 2/22/18.
 */

public class FoundationalTests {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void deck_hasOnlyUniqueCards() {
//        TODO
//        Deck deck = new Deck();
//        List<Card> drawnCards = ArrayList();
//        while (deck.size != 0) {
//            Card newCard = deck.draw();
//            if (drawnCards.contains(newCard)) {
//                fail("Drew a previously drawn card");
//            }
//            drawnCards.add(newCard);
//        }
//        drawnCards.add(deck.drawCard());
    }

    @Test
    public void deck_has36Cards() {
        Deck aDeck = new Deck();
        assertEquals(aDeck.getDeckSize(), 36);
    }

    @Test
    public void card_hasSuits() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits, 6);

        assertNotNull("Expected card suits to be non-null", card.getSuits());
    }

    @Test
    public void card_hasName() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits, 6);

        assertNotNull("Expected card name to be non-null", card.getName());
    }

    @Test
    public void card_hasRank() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits, 6);

        assertNotNull("Expected card rank to be non-null", card.getRank());
    }
}
