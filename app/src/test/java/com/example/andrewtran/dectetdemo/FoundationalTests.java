package com.example.andrewtran.dectetdemo;

import com.example.andrewtran.dectetdemo.Models.Card;

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
    public void deck_ReturnsCurrentSize() {
        // TODO
    }

    @Test
    public void card_hasSuits() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits);

        assertNotNull("Expected card suits to be non-null", card.getSuits());
    }

    @Test
    public void card_hasName() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits);

        assertNotNull("Expected card name to be non-null", card.getName());
    }
}
