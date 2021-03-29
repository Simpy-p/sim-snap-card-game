package com.sim;
import java.util.*;

public class CardGame {
    //default value:empty list
    private String name;
    //    -Has a String suit. Use the unicode characters of heart, club, diamond and spade
    String[] suits= {"\u2666","\u2665","\u2663","\u2660"};
    //    \u2665=Heart;
    //    \u2660=spade;
    //    \u2663=Club;
    //    \u2666=Diamond;

    //•-Has a String symbol (2,3,4,5,6,7,8,9,10,J,Q,K,A)
    String[] ranks ={ "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "J", "Q", "K","A"};

//    private int[] values ={2,3,4,5,6,7,8,9,10,11,12,13,14};
    private ArrayList<Card> deckCards = new ArrayList<Card>();


    public CardGame(String name) {
        this.name = name;
        getDeck();
    }

    public ArrayList<Card> getDeck(){
        for (String suit: suits) {
            for (int i=0;i< ranks.length;i++) {
                if(ranks[i] =="J"){
                    deckCards.add(new Card(suit,ranks[i],11));
                }else if(ranks[i] =="Q"){
                    deckCards.add(new Card(suit,ranks[i],12));
                }else if(ranks[i] =="K"){
                    deckCards.add(new Card(suit,ranks[i],13));
                }else if(ranks[i] =="A"){
                    deckCards.add(new Card(suit,ranks[i],14));
                }else{
                    deckCards.add(new Card(suit,ranks[i],i+2));
                }
            }
        }
        return deckCards;
    }
    public void shuffleDeck() {
        Collections.shuffle(deckCards);
    }
    public void displayDeck() {
       for(int i=0;i<deckCards.size()-1;i++){
           System.out.println(deckCards.get(i));
       }
    }
    public void displayHands(ArrayList<Card> hands) {
        System.out.println("**********Cards played*********");
        for(int i=0;i<hands.size();i++){
            System.out.println(hands.get(i));
        }
        System.out.println("******************************");
    }

    public ArrayList<Card> getDeckCards() {
        return deckCards;
    }

    public String getName() {
        return name;
    }

    public Card dealCard(ArrayList<Card> deck) {
       Card tempCard=deck.get(0);
        deck.remove(0);
       return tempCard;
    }

    public void sortDeckInNumberOrder(){
        Comparator<Card> numberComparator =
            Comparator.comparing(Card::getRank);
            deckCards.sort(numberComparator);
    }
    public void sortDeckInSuitOrder() {
        deckCards.sort(Comparator.comparing(Card::getSuit));
    }


    @Override
    public String toString() {
        return "CardGame{" +
                "name='" + name + '\'' +
                ", deckCards=" + deckCards.size() +
                ", deckCards=" + deckCards +
                '}';
    }



}
