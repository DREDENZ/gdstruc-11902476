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
        System.out.println("\nElements in Linked List: " + size);
    }

    public Player removeFirstElement(){
        Player temp = head.getPlayer();
        head = head.getNextPlayer();
        size -=1;
        return temp;
    }

    public boolean contains(Player target){
        PlayerNode player = head;
        while(player != null){
           if(target == player.getPlayer())
           {
               return true;
           }
           player = player.getNextPlayer();
       }
        return false;
    }

    public void indexOf(Player target){
        PlayerNode node = head;
        int index = 0;
        while(node != null){
            if(target == node.getPlayer())
            {
                System.out.println("\nPlayer is in index: " +  index);
            }
            else if(node.getNextPlayer() == null)
            {
                System.out.println("\nPlayer is unavailable");
            }
            node = node.getNextPlayer();
            index += 1;
        }

    }
}
