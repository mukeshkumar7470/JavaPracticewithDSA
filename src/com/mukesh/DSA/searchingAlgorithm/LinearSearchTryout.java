package com.mukesh.DSA.searchingAlgorithm;

/*
 Let us analyze the time complexity of linear search algorithm.

Best case:

Suppose in the previous scenario if the full marks, i.e., 50 is present as the first element of marks array.

marks = {50,39,45,47,40,15,23,32,25,49}

In this case, searching for an element will stop with just one comparison which is the best case.

Worst case:

Now let us assume that the full marks, i.e., 50 is present as the last element or not even present in the marks array.

marks = {10,39,45,47,40,15,23,32,25,50};

or

marks = {10,39,45,47,40,15,23,32,25,28};

In this case, the searching of element will stop after 10 comparisons, i.e., total number of elements present in the marks array.

This is the worst case.

So, if there is an array of size n, the number of comparisons required in the worst case will be n.

Hence, the worst case time complexity for Linear search is O(n).

 */

public class LinearSearchTryout {
    public static int search(int arrayOfElements[], int elementToBeSearched) {
        for (int index = 0; index < arrayOfElements.length; index++) {
            // Returning the index of the element if the element is found
            if (arrayOfElements[index] == elementToBeSearched)
                return index;
        }
        // Returning -1 if the element is not found
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayOfElements = { 10, 39, 45, 47, 50, 15, 23, 32, 25, 49 };
        int elementToBeSearched = 50;

        int index = search(arrayOfElements, elementToBeSearched);

        // Checking whether the element has been found or not
        if (index == -1)
            System.out.println("Element is not present in the array!");
        else
            System.out.println("Element is found at index position " + index+"!");
    }
}
