package com.mukesh.CodingNinja.assignment;

public class SumOfEvens {

    public static void main(String[] args)
    {
        int l = 2, r = 5;
        System.out.println ("Sum of Natural numbers from L to R is "+
                sumEven(l, r));
    }

    private static int sumEven(int l, int r) {

        return sumNatural(r/2) - sumNatural((l-1) / 2);
    }

    private static int sumNatural(int n) {

        int sum = (n * (n + 1));
        return sum;
    }

}
