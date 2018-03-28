package com.example.andrewtran.dectetdemo;

import com.example.andrewtran.dectetdemo.Models.Card;
import com.example.andrewtran.dectetdemo.Models.CardImpl;
import com.example.andrewtran.dectetdemo.Models.Deck;
import com.example.andrewtran.dectetdemo.Models.DeckImpl;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by andrewtran on 3/7/18.
 * Tests for class DeckImpl
 */

public class DeckTest {

    private String [] mCardSuits;
    private int [] mCardRanks;
    private String [] mCardNames;

    public DeckTest() {
        super();
        mCardSuits = new String[] {"suns", "waves", "wyrms", "knots", "moons", "leaves",
                "waves_leaves", "suns_wyrms", "moons_knots", "moons_waves", "leaves_wyrms",
                "suns_knots", "moons_suns", "waves_leaves", "wyrms_knots", "wyrms_knots",
                "moons_leaves", "suns_waves", "suns_wyrms", "leaves_knots", "moons_waves",
                "waves_wyrms", "suns_knots", "moons_leaves", "moons_suns", "waves_leaves",
                "wyrms_knots", "waves_wyrms", "moons_suns", "leaves_knots", "wyrms", "leaves",
                "suns", "moons", "knots", "waves"};
        mCardRanks = new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7,
                7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10, 10, 10};
        mCardNames = new String[]{"Ace of Suns", "Ace of Waves", "Ace of Wyrms", "Ace of Knots",
                "Ace of Moons", "Ace of Leaves", "The Origin", "The Desert", "The Author",
                "The Journey", "The Savage", "The Painter", "The Mountain", "The Sailor", "The Battle",
                "The Soldier", "The Forest", "The Discovery", "The Penitent", "The Market",
                "The Lunatic", "The Cave", "The Castle", "The Chance Meeting", "The Diplomat",
                "The Mill", "The Betrayal", "The Darkness", "The Pact", "The Merchant",
                "The Calamity", "The End", "The Bard", "The Huntress", "The Windfall", "The Sea"};
    }

    @Test
    public void drawCard_drawsUniqueCards() {
        Deck aDeck = new DeckImpl(mCardSuits, mCardRanks, mCardNames);
        List<CardImpl> drawnCards = new ArrayList<>();
        while (aDeck.getDeckSize() > 0) {
            Card aDrawnCard = aDeck.drawCard();
            if (drawnCards.contains(aDrawnCard)) {
                fail("DeckImpl drew a card that was previously drawn");
            }
        }
    }

    @Test
    public void drawCard_ReturnsNullFromEmptyDeck() {
        Deck aDeck = new DeckImpl(new String[]{}, new int[]{}, new String[]{});
        Card aCard = aDeck.drawCard();
        Assert.assertNull("Expected to draw null from empty deck", aCard);
    }

    @Test
    public void getDeckSize_ofNewDeck_returns36() {
        DeckImpl aDeck = new DeckImpl(mCardSuits, mCardRanks, mCardNames);
        assertEquals(aDeck.getDeckSize(), 36);
    }

    @Test
    public void drawCard_returnsCards() {
        DeckImpl aDeck = new DeckImpl(mCardSuits, mCardRanks, mCardNames);
        Card aDrawnCard = aDeck.drawCard();
        String[] cardSuits = aDrawnCard.getSuits();

        assertNotNull("Expected card suits to be non-null", cardSuits);
        assertTrue(cardSuits.length > 0);
        assertTrue(cardSuits.length < 3);

        String cardName = aDrawnCard.getName();

        assertNotNull("Expected card name to be non-null", cardName);
        assertNotEquals(cardName.length(), 0);

        int cardRank = aDrawnCard.getRank();

        assertNotNull("Expected card rank to be non-null", aDrawnCard.getRank());
        assertTrue(cardRank > 0);
        assertTrue(cardRank < 11);
    }

    @Test
    public void drawCard_removesCardsFromDeck() {
        DeckImpl aDeck = new DeckImpl(mCardSuits, mCardRanks, mCardNames);
        int oldDeckSize = aDeck.getDeckSize();
        aDeck.drawCard();
        int newDeckSize = aDeck.getDeckSize();
        assertTrue(newDeckSize == oldDeckSize - 1);
    }
}
