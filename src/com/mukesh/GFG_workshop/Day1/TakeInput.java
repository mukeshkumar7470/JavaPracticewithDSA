package com.mukesh.GFG_workshop.Day1;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);
        System.out.print("Size of the array is: ");
        int n = s.nextInt();
        int [] arr = new int[n];



        for (int i = 0; i<n; i++){
            System.out.print("Give me "+i+"th element: ");
            arr[i] = s.nextInt();
        }

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");

        }

        int sum = 0;
        for (int i  = 0; i<n; i++){
            sum = sum+arr[i];
        }
        System.out.println("\nThe Sum of all elements of array is " +sum);


    }

}
