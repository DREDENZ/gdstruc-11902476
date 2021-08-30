package com.dwightterencetablizo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] numbers = new int[10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        // Present Original Order
        System.out.println("Before Bubble Sort: ");
        printArrayElements(numbers);

        // Bubble Sort and Present new order
        bubbleSort(numbers);
        System.out.println("\n\nAfter Bubble Sort: ");
        printArrayElements(numbers);

        // Selection Sort and Present new order
//        selectionSort(numbers);
//        System.out.println("\n\nAfter Selection Sort: ");
//        printArrayElements(numbers);
    }

    // Bubble sort (descending order)
    private static void bubbleSort(int[] arr)
    {
        // Ascending Order Bubble Sort
        /*for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 0; i < lastSortedIndex; i++)
            {
                if(arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }*/

        // Descending Order Bubble Sort 1
        /*for(int i = 0; i < arr.length; i++)
        {
            for(int j = 1; j < arr.length - i; j++)
            {
                if(arr[j-1] < arr[j])
                {
                    int temp = arr[j - 1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/

        // Descending Order Bubble Sort 2
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 0; i < lastSortedIndex; i++)
            {
                if(arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        // Descending Order Bubble Sort 3
        // Compare the elements of an index to the index before it
        /*for(int i = 0; i < arr.length; i++)
        {
            for(int sortedIndex = arr.length - 9; sortedIndex < arr.length - i; sortedIndex++)
            {
                // IF the element of index - 1 is less than the current index, the elements are switched
                if(arr[sortedIndex - 1] < arr[sortedIndex])
                {
                    int temp = arr[sortedIndex - 1];
                    arr[sortedIndex - 1] = arr[sortedIndex];
                    arr[sortedIndex] = temp;
                }
            }
        }*/


    }

    // Selection sort (descending order & smallest element at the end)
    private static void selectionSort(int[] arr)
    {
        // Ascending Order Selection Sort
        /*for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }*/

        // ======== TO BE FIXED? ===========
        // Descending Order Selection Sort 1
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }

        // Descending Order Selection Sort 2
        /*for(int i = 0; i < arr.length - 1; i++)
        {
            int smallestIndex = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] > arr[smallestIndex])
                {
                    smallestIndex = j;
                }
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }*/
    }

    private static void printArrayElements(int[] arr)
    {
        for(int j : arr)
        {
            System.out.print(j + " ");
        }
    }
}
