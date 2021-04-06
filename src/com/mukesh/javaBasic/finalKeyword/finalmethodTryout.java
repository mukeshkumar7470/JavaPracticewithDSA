package com.mukesh.javaBasic.finalKeyword;

class A {
    public void example() {
        System.out.println("A Class Method");
    }
}

class B extends A {
    @Override
    public void example() {
        System.out.println("B Class Method");
    }

}

public class finalmethodTryout {
    public static void main(String[] args) {
        B obj = new B();
        obj.example();
    }
}
