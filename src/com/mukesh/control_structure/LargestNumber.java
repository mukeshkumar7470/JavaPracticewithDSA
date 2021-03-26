package com.mukesh.control_structure;

public class LargestNumber {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 5, largest, temp;


        temp = a > b ? a : b;
        //comparing the temp variable with c and storing the result in the variable
        largest = c > temp ? c : temp;
        //prints the largest number
        System.out.println("The largest number is: " + largest);

    }
}
