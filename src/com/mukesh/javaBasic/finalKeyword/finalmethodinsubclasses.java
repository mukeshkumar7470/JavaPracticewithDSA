package com.mukesh.javaBasic.finalKeyword;

class E {
    final void example() {
        System.out.println("Class A method");
    }
}

class C extends A {
    void demo() {
        System.out.println("Class B method");
    }
}

public class finalmethodinsubclasses {
    public static void main(String[] args) {
        C obj = new C();
        obj.example();
    }
}
