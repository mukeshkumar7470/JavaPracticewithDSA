package com.mukesh.GFG_workshop.Day5;

import java.util.HashMap;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args){
//        int[] arr = input();
//        int n = arr.length;

        String str = "qvaabbbcc";
        System.out.println(str.charAt(5));
        System.out.println("---------------new-----------");

        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (int i = 0; i<str.length(); i++){
            char key = str.charAt(i);

            if (hashMap.containsKey(key)){
                int value = hashMap.get(key)+1;
                hashMap.put(key, value);
            }else {
                hashMap.put(key, 1);
            }
        }

        for (char i:hashMap.keySet()){
            System.out.println(i+" "+hashMap.get(i));
        }

        /*HashMap<Character,Integer> hashMap = new HashMap<>();
        hashMap.put('a',1);
        hashMap.put('b',2);
        hashMap.put('c',3);
        System.out.println(hashMap.get('c'));

        for (char i:hashMap.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(hashMap.containsKey('a'));
        hashMap.remove('a');
        System.out.println(hashMap.containsKey('a'));*/

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
