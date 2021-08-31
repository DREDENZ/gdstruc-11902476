package com.dwightterencetablizo;

public class PlayerLinkedList {
    private PlayerNode head;
    int size = 0;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size += 1;
    }

    public void printList(){
        PlayerNode current = head;
        System.out.println("HEAD -> ");
        while (current != null){
            System.out.println(current.getPlayer());
            System.out.println(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.println("Elements in Linked List: " + size);
    }

    public void removeFirstElement(){
        PlayerNode firstElement = head;
        size -=1;
        System.out.println("Removed Element: " + firstElement.getPlayer());
        firstElement = null;
    }

    public void contains(Player target){
        PlayerNode player = head;
        while(player != null){
           if(target == player.getPlayer())
           {
               System.out.println("True");
           }
           player = player.getNextPlayer();
       }
        System.out.println("False");
    }

    public void indexOf(Player target){
        PlayerNode node = head;
        while(node != null){
            if(target == node.getPlayer())
            {
                System.out.println(node);
            }
            node = node.getNextPlayer();
        }
        System.out.println("False");
    }
}
