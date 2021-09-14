package com.dwightterencetablizo;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;

    public CardStack()
    {
        stack = new LinkedList<Card>(); // no capacity to be initialized, as linked lists are easily resizable
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Card pop()
    {
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

}
