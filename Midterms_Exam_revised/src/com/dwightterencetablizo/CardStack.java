package com.dwightterencetablizo;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;
    public int stackSize = 0;

    public CardStack()
    {
        stack = new LinkedList<Card>(); // no capacity to be initialized, as linked lists are easily resizable
    }

    public void push(Card card)
    {
        stackSize++;
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
        stackSize--;
        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();

        System.out.println("Printing Stack: ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public int size()
    {
        return stackSize;
    }

}
