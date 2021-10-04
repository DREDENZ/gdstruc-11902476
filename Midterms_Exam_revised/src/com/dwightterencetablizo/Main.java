package com.dwightterencetablizo;

import java.util.Random;

public class Main {
    public static void draw(int x, CardStack addStack, CardStack subtractStack)
    {
        if (subtractStack.size() < x && subtractStack.size() < 6)
        {
            x = subtractStack.size();
        }
        else if (subtractStack.size() < x)
        {
            System.out.println("No cards to discard \n");
        }
        else
        {
            System.out.println("removing in progress \n");
            for (int i = 0; i < x; i++)
            {
                addStack.push(subtractStack.pop());
            }
            System.out.println("Amount Removed: " + x + "\n");
            addStack.printStack();
        }
    }

    public static void main(String[] args) {
	// write your code here
        // initialize linked list stacks
        CardStack playerStack = new CardStack();
        CardStack handStack = new CardStack();
        CardStack discardStack = new CardStack();

        // input card details to be put in the stack
        for (int i = 1; i < 31; i++)
        {
            playerStack.push(new Card(i, "Card #" + i));
        }

        // commands
        while(!playerStack.isEmpty())
        {
            Random rand = new Random();
            int command = rand.nextInt(3) + 1; // generates a random number from 1 - 3
            int x = rand.nextInt(5) + 1; // generates a random number from 1-5

            System.out.println("\n Action: " + command);

            // Command 1: DRAW x cards from player stack to hand stack
            if (command == 1)
            {
                draw(x, handStack, playerStack);

                System.out.println("Amount of Cards in Player Stack: " + playerStack.size());
                System.out.println("Amount of Cards in Player Hand: " + handStack.size());
                System.out.println("Amount of Cards in Discard Pile: " + discardStack.size());
            }
            // Command 2: DRAW x cards from hand stack to discard stack
            else if (command == 2)
            {
                draw(x, discardStack, handStack);

                System.out.println("Amount of Cards in Player Stack: " + playerStack.size());
                System.out.println("Amount of Cards in Player Hand: " + handStack.size());
                System.out.println("Amount of Cards in Discard Pile: " + discardStack.size());
            }
            // Command 3: DRAW x cards from discard stack to hand stack
            else
            {
                draw(x, handStack, discardStack);

                System.out.println("\nAmount of Cards in Player Stack: " + playerStack.size());
                System.out.println("Amount of Cards in Player Hand: " + handStack.size());
                System.out.println("Amount of Cards in Discard Pile: " + discardStack.size());
            }
        }
        System.out.println("\n All Cards have been moved!");
    }
}
