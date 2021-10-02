package com.dwightterencetablizo;

import java.util.Random;

public class Main {
    public static void startQueue(int queueNum, ArrayQueue queued, ArrayQueue queing, int queueMin) {
        for (int i = 0; i < queueNum; i++)
        {
            queued.add(queing.remove());
            queueMin--;
        }
        queued.printQueue();
    }

    public static void main(String[] args) {
	// write your code here
        int turnNum;

        // instantialize queues
        ArrayQueue queing = new ArrayQueue(10);
        ArrayQueue queued = new ArrayQueue(10);

        // create players that want to queue
        Player aceue = new Player(1,"aceu", 100);
        Player Sinatraa = new Player(2,"Sinatraa", 100);
        Player Subroza = new Player(3,"Subroza", 95);
        Player ploo = new Player(4,"ploo", 90);
        Player tenZ = new Player(5,"tenZ", 95);
        Player Asuna = new Player(6, "Asuna",100);
        Player LethalBacon = new Player(7, "LethalBacon",205);
        Player HPDeskjet = new Player(8, "HPDeskjet",34);
        Player Jamez = new Player(9, "Jamez",324);
        Player t_renz = new Player(10, "t_renz", 80);

        // add players into queue for queuing
        queing.add(aceue);
        queing.add(Sinatraa);
        queing.add(Subroza);
        queing.add(ploo);
        queing.add(tenZ);
        queing.add(Asuna);
        queing.add(LethalBacon);
        queing.add(HPDeskjet);
        queing.add(Jamez);
        queing.add(t_renz);

        // generate random number from 1 - 7 at the start of the turn (enter key ends turn)
        Random rand = new Random();
        int queueNum = rand.nextInt(7) + 1; // generates a random number from 1 - 7
        int queueMin = 5; // minimum required number of players per game
        int gameNum = 1;

        // stop loop once there have been 10 games
        for (int i = 0; i < 10; i++)
        {
            if (queueMin > 0)
            {
                startQueue(queueNum, queued, queing, queueMin);
            }
            else if (queueMin <= 0)
            {
                // game starts when there are at least 5 players (pop the first 5 players when game starts)
                System.out.println("\n Game #" + gameNum + " has begun \n");
                queueMin = 5;
                gameNum++;
            }
        }
    }
}
