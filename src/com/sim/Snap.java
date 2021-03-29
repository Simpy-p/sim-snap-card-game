package com.sim;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame{

    private boolean selectFlag = false;
    private String playerOne;
    private String playerTwo;


    public String createPlayer(){

        String playerName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Player Name");
        System.out.println("-------------------------\n");
        playerName = input.next();
        return playerName;
    }
    public Snap(String name) {
        super(name);
    }


    public void displayRules() {
        System.out.println("--------------Rules---------------------------------------------\n");
        System.out.println("By pressing enter in the command line, the user takes their turn.");
        System.out.println("Each turn, a new card is dealt from the deck. ");
        System.out.println("The game continues until two cards in a row have the same symbol");
        System.out.println("at which point the “player” wins and the game ends.");
        System.out.println("----------------------------------------------------------------\n");
    }
    public boolean turn(boolean flag) {
       if(flag==true){
           return false;
       }else{
           return true;
       }

    }
    public ArrayList<Card> cardSplitDeck(int start, int end) {
        ArrayList<Card> playersCards= new ArrayList<Card>();
        for(int i=start; i<end; i++){
            playersCards.add(getDeckCards().get(i));
        }
        return  playersCards;
    }


    @Override
    public String toString() {
        return super.toString()+"Players:"+playerOne +" and "+ playerTwo;
    }

    public void startGame() {

        String selection;
        playerOne=createPlayer();
        playerTwo=createPlayer();
        Scanner input = new Scanner(System.in);
        displayRules();
        System.out.println("Player1: Click Enter to start the Game");
        selection = input.nextLine();
        boolean flag= turn(selectFlag);
//        CardGame player1=new CardGame("Snap");
        System.out.println("--------Generate the deck------");
//        System.out.println(getDeck());
        System.out.println("--------Deck of Shuffle cards-------");
        shuffleDeck();
        displayDeck();

        ArrayList<Card> firstPlayersCards=cardSplitDeck(0, 26);
        System.out.println("first Player Deck"+firstPlayersCards);

        ArrayList<Card> secondPlayersCards=cardSplitDeck(26, 52);
        System.out.println("Second Player Deck"+secondPlayersCards);

        boolean winFlag=false;

        if (selection.equals("")) {
            ArrayList<Card> selectDeck = new ArrayList<Card>();
            selectDeck.add(dealCard(firstPlayersCards));
            displayHands(selectDeck);

            while (!winFlag || firstPlayersCards.size()==0){
                if (selectDeck.size() > 1) {
                    int index = selectDeck.size() - 1;
                    Card c1=selectDeck.get(index);
                    Card c2=selectDeck.get(index-1);
                    if(c1.getSuit().equals(c2.getSuit())){
                        if(!flag) {
                            System.out.println(playerOne+": SNAP SNAP SNAP SNAP");
                        }else{
                            System.out.println(playerTwo+": SNAP SNAP SNAP SNAP");
                        }
                        winFlag=true;
                        break;
                    } else {
                        winFlag=false;
                    }
                }else {
                    winFlag=false;
                }
                selection = input.nextLine();
                selectDeck.add(dealCard(secondPlayersCards));

                if(flag) {
                    System.out.println(playerOne+":Click Enter for next Card");
                }else{
                    System.out.println(playerTwo+":Click Enter for next Card");
                }
                flag=turn(flag);
                displayHands(selectDeck);


            }

        }
    }
}
