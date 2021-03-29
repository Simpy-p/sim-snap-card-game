package com.sim;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        Stage 1:Using classes, ArrayLists and methods, create a deck of Cards.
//        You should use the following classes: CardGame
//        •-Contains an ArrayList<Card> for the deckOfCards that contains all 52 cards.
//        This is created and populated when the game is constructed.
//        •-Has a name which is also defined in the constructor.
//        •-Has a getDeck method that lists out the cards in the deck.
//        CardGame snap=new CardGame("Snap");
////        Card cards = new Card();
//        System.out.println("--------Deck of cards-------");
////        snap.getDeck();
//        System.out.println(snap);
////        shuffles the deck into a random order and stores the new shuffled deck back into the deckOfCards attribute
//        System.out.println("--------Deck of Shuffle cards-------");
//        snap.shuffleDeck();
//        System.out.println(snap);
////        takes the card from the top of the deck and returns it
//        System.out.println("--------Deal: card from the top of the deck-------");
//        System.out.println(snap.dealCard());
//        System.out.println(snap);
//        System.out.println("--------Deck of cards-------");
//        snap.displayDeck();
//
//
//        System.out.println("--------Deck of sorted on number-------");
//        snap.sortDeckInNumberOrder();
//        snap.displayDeck();
//        System.out.println("--------Deck of sorted on suit-------");
//        snap.sortDeckInSuitOrder();
//        snap.displayDeck();
        System.out.println("--------Game-------");
        Snap snap= new Snap("Snap" );
        snap.startGame();


//        cards.createCards();
//        System.out.println(cards);



    }
}
