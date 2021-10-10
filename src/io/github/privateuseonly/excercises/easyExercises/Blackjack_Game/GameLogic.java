package io.github.privateuseonly.excercises.easyExercises.Blackjack_Game;

import java.util.Scanner;
import java.util.Random;

public class GameLogic extends GameOfBlackjack {

    int userCredits = 2000;
    int[] deck = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    int[] userCards = new int[10];
    int[] dealerCards = new int[10];
    int userPoints = 0;
    int dealerPoints = 0;
    int blackjack = 21;
    int bet = 0;

    public void startGame(){
        askForBet();
        dealFourCards();
        showFirstCards();
        checkCards();
        System.out.println("user points: "+userPoints+" dealer points: "+dealerPoints);
        wantDouble(bet);
    }

    private boolean wantDouble(int betAmount) {
        String decision;
        if (bet <= bet * 2){
            System.out.println("Want to double the bet? y/n");
            Scanner userDecision = new Scanner(System.in);
            decision = userDecision.toString();
            userDecision.close();
            if (decision.equals("y")){
                bet = betAmount * 2;
            }
            return true;
        }
        else{
            return false;
        }

    }

    private void checkCards() {
        for (int i = 0; i < 10; i++){
            userPoints += userCards[i];
            dealerPoints += dealerCards[i];
        }
        if (userPoints == blackjack && dealerPoints == blackjack){
            System.out.println("Blackjack! But it's a draw!");
        }else if (userPoints == blackjack){
            userCredits += bet;
            System.out.println("Blackjack! You won!");
        }else if (dealerPoints == blackjack){
            userCredits -= bet;
            System.out.println("You lost!");
        }
    }

    private void showFirstCards() {
        System.out.println(userCards[0] + " " + userCards[1]);
        System.out.println(dealerCards[0]);
    }

    private void dealFourCards() {
        for (int i = 0; i < 2; i++){
            userCards[i] = dealCard();
            dealerCards[i] = dealCard();
        }
    }

    int dealCard() {
        Random randomCard = new Random();
        int card = randomCard.nextInt(deck.length+1);
        return deck[card];
    }

    private void askForBet(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type your bet: ");
        bet = userInput.nextInt();
        userInput.close();
        if (bet > userCredits){
            askForBet();
        }
    }


}
