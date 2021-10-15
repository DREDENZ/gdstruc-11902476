package com.dwightterencetablizo;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void startQueue(int randomNum, ArrayQueue forQueue, ArrayQueue doneQueue) {
        if (randomNum > forQueue.size())
        {
            randomNum = forQueue.size();
        }
        else
        {
            for (int i = 0; i < randomNum; i++)
            {
                doneQueue.add(forQueue.remove());
            }
        }
        doneQueue.printQueue();
    }

    public static void pressEnter(){
        System.out.println("\nPress \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void main(String[] args) {
	// write your code here
        int turnNum = 0;

        // instantialize queues
        ArrayQueue forQueue = new ArrayQueue(70);
        ArrayQueue doneQueue = new ArrayQueue(70);

        // create players & add players to queuing area
        for (int i = 1; i < 70; i++)
        {
            forQueue.add(new Player(i, "Player #" + i, i));
        }

        while (turnNum < 11)
        {
            // generate number fromm 1-7 to be queued
            Random rand = new Random();
            int loadPlayer = rand.nextInt(7) + 1;

            System.out.println("\nQueuing Players...");
            startQueue(loadPlayer, forQueue, doneQueue);
            if (loadPlayer >= 5 || doneQueue.size() >= 5 && turnNum < 10)
            {
                System.out.println("\n========= Game #" + (turnNum + 1) + " Starting! =========");
                turnNum++;
            }
            else if (turnNum == 10)
            {
                System.out.println("\n========= Last Game Starting! =========\n");
                turnNum++;
            }
            pressEnter();
        }
    }
}
