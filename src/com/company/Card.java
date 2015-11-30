package com.company;

/**
 * Created by cameronoakley on 11/30/15.
 */
public class Card {
    enum Suit{
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }
    enum Rank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }
    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
}
