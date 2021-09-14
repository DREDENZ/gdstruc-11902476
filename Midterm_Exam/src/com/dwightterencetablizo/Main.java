package com.dwightterencetablizo;

import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // initialize linked list stacks
        CardStack mainStack = new CardStack();
        CardStack playerStack = new CardStack();
        CardStack discardStack = new CardStack();

        int mainStackCards = 30;
        int cardsOnHand = 0;
        int discardedCards = 0;

        // input card details to be put in the stack
        mainStack.push(new Card(1, "one"));
        mainStack.push(new Card(2, "two"));
        mainStack.push(new Card(3, "three"));
        mainStack.push(new Card(4, "four"));
        mainStack.push(new Card(5, "five"));
        mainStack.push(new Card(6, "six"));
        mainStack.push(new Card(7, "seven"));
        mainStack.push(new Card(8, "eight"));
        mainStack.push(new Card(9, "nine"));
        mainStack.push(new Card(10, "ten"));
        mainStack.push(new Card(11, "eleven"));
        mainStack.push(new Card(12, "twelve"));
        mainStack.push(new Card(13, "thirteen"));
        mainStack.push(new Card(14, "fourteen"));
        mainStack.push(new Card(15, "fifteen"));
        mainStack.push(new Card(16, "sixteen"));
        mainStack.push(new Card(17, "seventeen"));
        mainStack.push(new Card(18, "eighteen"));
        mainStack.push(new Card(19, "nineteen"));
        mainStack.push(new Card(20, "twenty"));
        mainStack.push(new Card(21, "twenty-one"));
        mainStack.push(new Card(22, "twenty-two"));
        mainStack.push(new Card(23, "twenty-three"));
        mainStack.push(new Card(24, "twenty-four"));
        mainStack.push(new Card(25, "twenty-five"));
        mainStack.push(new Card(26, "twenty-six"));
        mainStack.push(new Card(27, "twenty-seven"));
        mainStack.push(new Card(28, "twenty-eight"));
        mainStack.push(new Card(29, "twenty-nine"));
        mainStack.push(new Card(30, "thirty"));

        // Commands
        Random rand = new Random();
        int command = rand.nextInt(3) + 1; // generates a random number from 1 - 3
        int num = rand.nextInt(5) + 1; // generates a random number from 1-5

        System.out.println("Action: " + command);

        // DRAW x cards (x = random number from 1-5)
        if (command == 1)
        {

            for (int i = 0; i < num; i++)
            {
                playerStack.push(mainStack.peek()); // takes card from main stack
                mainStack.pop(); // removes cards taken from main stack

                mainStackCards--;
                cardsOnHand++;
            }
            System.out.println("Amount Removed: " + num); // print amount removed
            playerStack.printStack(); // print player stack
        }

        // DISCARD x cards (x = random number from 1-5)
        else if (command == 2)
        {
            if (num > cardsOnHand)
            {
                System.out.println("No cards to discard");
            }
            else
            {
                for (int i = 0; i < num; i++)
                {
                    discardStack.push(playerStack.peek()); // discards cards from hand
                    playerStack.pop(); // removes cards taken from hand

                    mainStackCards--;
                    cardsOnHand++;
                }
                System.out.println("Amount Removed: " + num); // print amount removed
                discardStack.printStack(); // print discard stack
            }
        }

        // GET x cards from DISCARD pile (x = random number from 1-5)
        else
        {
            if (num > cardsOnHand)
            {
                System.out.println("No cards to discard");
            }
            else
            {
                for (int i = 0; i < num; i++)
                {
                    playerStack.push(discardStack.peek()); // takes card from discard pile
                    discardStack.pop(); // removes cards taken from discard pile

                    cardsOnHand++;
                    discardedCards--;
                }
                System.out.println("Amount Removed: " + num); // print amount removed
                playerStack.printStack(); // print player stack
            }
        }


    }
}
