package com.mukesh.GFG_workshop.Day4;

import java.util.Scanner;

public class Day4 {

    public static void main(String[] args){
        int[] arr = input();
        int n = arr.length;
        /*sort01(arr,n);
        System.out.println("\n-------better sorting using while loop---------");
        sort01Eff(arr,n);*/

        System.out.println("--------Pair Sum-------");
        Scanner s = new Scanner(System.in);

        int sum = s.nextInt();
        System.out.println(pairSum(arr, sum));

    }

    public static int pairSum(int[] arr, int sum){
        int count = 0;
        for (int i = 0; i<arr.length-1; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i]+arr[j] == sum){
                    count++;
                }
            }
        }
        return count;
    }

    public static void sort01Eff(int[] arr, int n){
        int i =0;
        int j=n-1;

        while (i<j){
            while (arr[i]==0){
                i++;
            }
            while (arr[j]==1){
                j--;
            }
            if(i<j){
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }

        for (int k = 0; k<n; k++){
            System.out.print(arr[k]+" ");
        }

    }

    public static void sort01(int[] arr, int n){
        int count1 = 0;
        int count0 = 0;

        for (int i = 0; i<n; i++){
            if (arr[i] == 1){
                count1++;
            }else {
                count0++;
            }
        }
        int i =0;
        for (; i<count0; i++){
            arr[i]=0;
        }
        for (; i<n; i++){
            arr[i]= 1;
        }
        for (int j = 0; j<n; j++){
            System.out.print(arr[j]+" ");
        }
    }

    public static int[] input() {

        Scanner s = new Scanner(System.in);
        System.out.print("Size of the array is: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Give me " + i + "th element: ");
            arr[i] = s.nextInt();
        }

        return arr;
    }
}
