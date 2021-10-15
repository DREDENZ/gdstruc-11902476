package com.dwightterencetablizo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player asuna = new Player(1, "Asuna",100);
        Player lethalBacon = new Player(2, "LethalBacon",205);
        Player hpDeskjet = new Player(3, "HPDeskjet",34);
        Player james = new Player(4, "Jamez",324);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        // Activity 1 & 2 - Remove Element & Size of Linked List
        System.out.println("Removed Element: " + playerLinkedList.removeFirstElement());
        playerLinkedList.printList();

        // Activity 3 - contains() & indexOf()
        System.out.println("\nThe player is in the list: " + playerLinkedList.contains(asuna));
        playerLinkedList.indexOf(asuna);
    }
}
