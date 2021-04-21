package com.mukesh.GFG_workshop.Day3;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args){
        int[] arr = input();

        reapting(arr);
        System.out.println("-----------Reapting Efficincy------------");
        reaptingEff(arr);
        System.out.println("-----------Next------------");
        reaptingEfff(arr);
    }

    public static void reaptingEfff(int[] arr){

        for (int i = 0; i<arr.length; i++){
            int value = Math.abs(arr[i]);
            if (arr[value]>0){
                arr[value]= -arr[value];
            }else {
                System.out.println(value+" ");
            }
        }
    }

    public static void reaptingEff(int[] arr){
        int[] freq = new int[arr.length-1];
        for (int i = 0; i<arr.length; i++){
            int value = arr[i];
            freq[value]++;
        }
        for (int i = 0; i<freq.length; i++){
            if (freq[i] == 2){
                System.out.println(i+" ");
            }
        }
    }

    private static void reapting(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println(arr[i]+ " ");
                    break;
                }
            }
            if (count == 2){
                break;
            }
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
