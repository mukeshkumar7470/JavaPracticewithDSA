package com.mukesh.basicCodingQuestion;

import java.util.Scanner;

public class PrimeNumbersBetween {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = 100;
        /*
            A prime number is a whole number greater than 1, whose only two whole-number factors are 1 and itself.
        */
        for(int i=2;i<=n;i++) // 1.So we are starting with initialization i = 2
        {
            int flag = 1;
            for(int j=2;j<=i/2;j++)  // 2.Try dividing the number by half check whether it divisible
            {
                if(i%j==0) // 3. If the number is divisible by other number ->Not a prime Number
                {
                    flag = 0;
                    break;
                }

            }
            if(flag==1) // 4. If the number is not divisible by any other numbers but only by itself and 1 -> prime no
            {
                System.out.print(i+" ");
            }
        }
    }
}
