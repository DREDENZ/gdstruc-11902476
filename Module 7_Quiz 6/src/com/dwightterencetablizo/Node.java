package com.dwightterencetablizo;

public class Node {
    private int data;
    private Node rightChild;
    private Node leftChild;

    // insert method
    public void insert (int value)
    {
        // check if value is equal to data in node
        if (value == data)
        {
            return; // not able to support duplicate values
        }

        // if value is less than the root
        if (value < data)
        {
            if (leftChild == null)
            {
                leftChild = new Node(value);
            }
            else
            {
                leftChild.insert(value);
            }
        }

        // if value is greater than the root
        else
        {
            if (rightChild == null)
            {
                rightChild = new Node(value);
            }
            else
            {
                rightChild.insert(value);
            }
        }
    }

    // Tree Traversal (In-Order Method)
    public void traverseInOrder()
    {
        // Check left child first
        if (leftChild != null)
        {
            leftChild.traverseInOrder();
        }
        System.out.println("Data: " + data);

        // Check right child
        if (rightChild != null)
        {
            rightChild.traverseInOrder();
        }
    }

    // get method
    public Node get(int value)
    {
        if (value == data)
        {
            return this;
        }

        // Check left child
        if (value < data)
        {
            if (leftChild != null)
            {
                return leftChild.get(value);
            }
        }

        // Check right child
        else
        {
            if (rightChild != null)
            {
                return rightChild.get(value);
            }
        }

        return null; // if value is not found
    }

    // get node with smallest value
    public Node getMin(Node temp)
    {
       Node holder = temp;

       if (leftChild != null)
       {
           return holder.getMin(leftChild);
       }
       return holder;
    }

    // get node with largest value
    public Node getMax(Node temp)
    {
        Node holder = temp;
        if (rightChild != null)
        {
            return holder.getMax(rightChild);
        }
        return holder;

    }

    // Tree Traversal (In-Order Descending)
    public void traverseInOrderDescending()
    {
        if (rightChild != null)
        {
            rightChild.traverseInOrderDescending();
        }
        System.out.println("Data: " + data);

        if (leftChild != null)
        {
            leftChild.traverseInOrderDescending();
        }
    }

    // Constructor
    public Node(int _data)
    {
        this.data = _data;
    }

    // Getters & Setters
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
