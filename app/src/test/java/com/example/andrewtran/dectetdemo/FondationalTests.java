package com.example.andrewtran.dectetdemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by andrewtran on 2/22/18.
 */

public class FondationalTests {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void deck_hasOnlyUniqueCards() {
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
    public void deck_ReturnsCurrentSize() {
        // TODO
    }
}
