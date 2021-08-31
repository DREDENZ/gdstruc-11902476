package com.dwightterencetablizo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player asuna = new Player(1, "Asuna",100);
        Player lethalBacon = new Player(2, "LethalBacon",205);
        Player hpDeskjet = new Player(3, "HPDeskjet",34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        //playerLinkedList.printList();

        // Activity 1 & 2 - Remove Element & Size of Linked List
        playerLinkedList.removeFirstElement(); // does instruction mean the head? or the first element to be added?
        playerLinkedList.printList();

        // Activity 3 - contains() & indexOf()
        //PlayerLinkedList.contains(asuna);
        //PlayerLinkedList.indexOf(asuna);
    }
}
