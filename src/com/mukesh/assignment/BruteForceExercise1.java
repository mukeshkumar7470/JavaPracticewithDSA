package com.mukesh.assignment;


/*
 Given a number 'num' and a power 'p', find and return the exponent of 'num' raised to the power 'p' using brute force technique. Implement the logic inside calculatePower() method.

Note: Do not use the Math.pow() method

Test the functionalities using the main() method of the tester class.

Sample Input and Output:

  num = 2
  p = 3
  output 8

  num = 0
  p = 10
  output
  0

*/

public class BruteForceExercise1 {

    public static int calculatePower(int num, int p) {
        //Implement your logic here and change the return statement accordingly
        int pow = 1;
        for (int i = 1; i <= p; i++)
            pow *= num;
        return pow;
    }

    public static void main(String[] args) {
        System.out.println(calculatePower(0,10));
    }
}
