package com.dwightterencetablizo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numbers2[] = new int[]{-53, 12, 17, 33, 60, 64, 105}; // arranged array

        System.out.println(arrangeArray3(numbers2, 64));
    }

    public static int arrayPlace(int[] array, int value)
    {
        // [STEP 1.1:] find the tens value of the element being searched
        int valueTens = value/10;

        for (int i = 0; i < array.length; i++)
        {
            // [STEP 1.2:] compare the tens value of the element being searched to the tens value of the elements in the array
            if (array[i]/10 == valueTens)
            {
                return i;
            }
        }

        // if the value being searched for is not in the array
        return -1;
    }

    public static int arrangeArray3(int[] array, int value)
    {
        // only works properly if used on an arranged array

        // [STEP 1:] search for the chosen value according to it's value by tens first
        int tenStart = arrayPlace(array, value); // returns the start of the number with the same tens as value

        while (tenStart < array.length)
        {
            // [STEP 2:] search for the exact value
            if (array[tenStart] == value)
            {
                return tenStart;
            }
            else
            {
                tenStart += 1;
            }
        }

        // if the value being searched for is not in the array
        return -1;
    }
}
