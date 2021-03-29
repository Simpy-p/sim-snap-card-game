package com.sim;

import java.util.*;

public class Card {
    private String suit, rank;
    private int value;

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }


    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                ", value=" + value +
                '}';
    }

}
