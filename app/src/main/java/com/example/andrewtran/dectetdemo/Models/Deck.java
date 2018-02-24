package com.example.andrewtran.dectetdemo.Models;

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
 */

public class Deck {
    String[] suits = {"pink", "brown"};
    Card card = new Card("The Lunatic", suits);
}
