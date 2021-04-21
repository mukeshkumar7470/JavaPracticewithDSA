package com.mukesh.GFG_workshop.Day2;

import java.util.Scanner;

public class DifferentMethods {
    public static void main(String[] args) {

        int[] arr = input();
        int s = sum(arr);

        int max = maximum(arr);
        System.out.println(max);

        int x = reaptingElement(arr);
        System.out.println(x);

        int reaptEf = reaptingEf(arr);
        System.out.println(reaptEf);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("\n------------------------------");
        increament(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int reaptingEf(int[] arr) {
        int n = arr.length;
        int sumN = ((n - 2) * (n - 1)) / 2;
        int sumA = sum(arr);
        int ans = sumA - sumN;

        return ans;

    }

    private static int reaptingElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }


    private static int maximum(int[] arr) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
//        System.out.println("\nThe Sum of all elements of array is " +sum);

        return sum;
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

    private static void increament(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }
}
