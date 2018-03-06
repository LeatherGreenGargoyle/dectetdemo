package com.example.andrewtran.dectetdemo;

import com.example.andrewtran.dectetdemo.Models.Card;
import com.example.andrewtran.dectetdemo.Models.Deck;

import org.junit.Test;

import static com.example.andrewtran.dectetdemo.Models.Card.MOONS;
import static com.example.andrewtran.dectetdemo.Models.Card.WAVES;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by andrewtran on 2/22/18.
 */

public class FoundationalTest {

    String [] mCardSuits;
    int [] mCardRanks;
    String [] mCardNames;

    public FoundationalTest() {
        super();
        mCardSuits = new String[]{"suns", "waves", "wyrms", "knots", "moons", "leaves",
                "waves_leaves", "suns_wyrms", "moons_knots", "moons_waves", "leaves_wyrms",
                "suns_knots", "moons_suns", "waves_leaves", "wyrms_knots", "moons_leaves",
                "suns_waves", "suns_wyrms", "leaves_knots", "moons_waves", "waves_wyrms",
                "suns_knots", "moons_leaves", "moons_suns", "waves_leaves", "wyrms_knots",
                "waves_wyrms", "moons_suns", "leaves_knots", "wyrms", "leaves", "suns", "moons",
                "knots", "waves"};
        mCardRanks = new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7,
                7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 10, 10};
        mCardNames = new String[]{"Ace of Suns", "Ace of Waves", "Ace of Wyrms", "Ace of Knots",
                "Ace of Moons", "Ace of Leaves", "The Origin", "The Desert", "The Author",
                "The Journey", "The Savage", "The Painter", "The Mountain", "The Sailor",
                "The Sailor", "The Forest", "The Discovery", "The Penitent", "The Market",
                "The Lunatic", "The Cave", "The Castle", "The Chance Meeting", "The Diplomat",
                "The Mill", "The Betrayal", "The Darkness", "The Pact", "The Merchant",
                "The Calamity", "The End", "The Bard", "The Huntress", "The Windfall", "The Sea"};
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
        Deck aDeck = new Deck(mCardSuits, mCardRanks, mCardNames);
        assertEquals(aDeck.getDeckSize(), 36);
    }

    @Test
    public void card_hasSuits() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits, 6);
        String[] cardSuits = card.getSuits();

        assertNotNull("Expected card suits to be non-null", cardSuits);
        assertTrue(cardSuits.length > 0);
        assertTrue(cardSuits.length < 3);
    }

    @Test
    public void card_hasName() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits, 6);
        String cardName = card.getName();

        assertNotNull("Expected card name to be non-null", cardName);
        assertNotEquals(cardName.length(), 0);
    }

    @Test
    public void card_hasRank() {
        String[] suits = {MOONS, WAVES};
        Card card = new Card("The Lunatic", suits, 6);
        int cardRank = card.getRank();

        assertNotNull("Expected card rank to be non-null", card.getRank());
        assertTrue(cardRank > 0);
        assertTrue(cardRank < 11);
    }
}
