package io.github.privateuseonly.excercises.easyExercises.Blackjack_Game;

import java.util.Scanner;
import java.util.Random;

public class GameLogic extends GameOfBlackjack {

    int userCredits = 2000;
    int[] deck = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    int[] userCards = new int[6];
    int[] dealerCards = new int[6];
    int userPoints = 0;
    int dealerPoints = 0;
    int blackjack = 21;
    int bet = 0;
    boolean doubled = false;
    String whoseTurn = "Player";

    public void startGame(){
        while (userCredits >= 0) {
            askForBet();
            dealFourCards();
            showFirstCards();
            sumPoints();
            checkBlackjack();
            System.out.println("user points: " + userPoints + " dealer points: " + dealerPoints);
            doubleHitOrStand(bet);
            sumPoints();
            while (!checkBlackjack() && !checkOver21()) {
                if (!doubled) {
                    while (askForCard()) {
                        // todo deal for player
                        dealCard();
                    }
                }
            }
        }
    }

    private boolean askForCard() {
        Scanner hit = new Scanner(System.in);
        System.out.println("Choose hit or stand? h/s");
        String hitStand = hit.toString();
        return hitStand.equals("h");
    }

    private void doubleHitOrStand(int betAmount) {
        String decision;
        if (bet <= bet * 2) {
            System.out.println("Want to double the bet, hit or stand? d/h/s");
            Scanner userDecision = new Scanner(System.in);
            decision = userDecision.toString();
            userDecision.close();
            if (decision.equals("d")) {
                bet = betAmount * 2;
                doubled = true;
                userCards[3] = dealCard();
            }
            else if (decision.equals("s")){
                whoseTurn = "Dealer";
            }
            else{
                userCards[3] = dealCard();
            }
        }
    }

    private void sumPoints() {
        userPoints = 0;
        dealerPoints = 0;
        for (int i = 0; i < 10; i++) {
            userPoints += userCards[i];
            dealerPoints += dealerCards[i];
        }
    }
    private boolean checkBlackjack() {
        if (userPoints == blackjack && dealerPoints == blackjack) {
            System.out.println("Blackjack! But it's a draw!");
            return true;
        } else if (userPoints == blackjack) {
            userCredits += bet;
            System.out.println("Blackjack! You won!");
            return true;
        } else if (dealerPoints == blackjack) {
            userCredits -= bet;
            System.out.println("You lost!");
            return true;
        }else return false;
    }

    private boolean checkOver21(){
        if (userPoints > blackjack){
            userCredits -= bet;
            System.out.println("You lost!");
            return true;

        }else if (dealerPoints > blackjack){
            userCredits += bet;
            System.out.println("You won!");
            return true;
        }else return false;
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
