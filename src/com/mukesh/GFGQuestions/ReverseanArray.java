package com.mukesh.GFGQuestions;
import java.util.Scanner;

/*
        Given an array A of size N, print the reverse of it.

        Input:
        First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.

        Output:
        For each testcase, in a new line, print the array in reverse order.

        Constraints:
        1 <= T <= 100
        1 <= N <=100
        0 <= Ai <= 100

        Example:
        Input:
        1
        4
        1 2 3 4
        Output:
        4 3 2 1    */


public class ReverseanArray {

        public static void reverse(int[] ar){
        for(int i=ar.length-1;i>=0;i--){
            System.out.print(ar[i]+" ");

        }
        System.out.println();

    }

        public static void main (String[] args)
        {
            Scanner s=new Scanner(System.in);
            int a=s.nextInt();
            while(a>0){
                int n=s.nextInt();
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=s.nextInt();
                }
                reverse(arr);
                a--;
            }
        }
}