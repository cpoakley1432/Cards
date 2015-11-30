package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    static HashSet<Card> createDeck(){
        HashSet<Card> deck = new HashSet<>();
        for (Card.Suit suit : Card.Suit.values()){
            for (Card.Rank rank : Card.Rank.values()){
                Card c = new Card(suit, rank);
                deck.add(c);
            }
        }
        return deck;
    }

    public static void main(String[] args) {
        HashSet<Card> deck = createDeck();
        System.out.println(deck.size());
    }

}
