package com.mukesh.basicCodingQuestion;

public class A {
    static int add(int i, int j){
        return i+j;
    }
}
class B extends A {
    public static void main(String[] args){
        short s = 9;
        System.out.println(add(s,6));
    }
}
