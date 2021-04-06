package com.mukesh.javaBasic.control_structure;

public class Sum {
    public static void main(String[] args) {
        // Implement your code here
//        int number1 = 6, number2 = 5;
        int number1 = 5, number2 = 5;
        int sum = 0;

        if (number1 == number2){

            sum = number1+number2;

            System.out.print("Sum is : " +sum);
        }else
            sum = (number1+number2)*2;

           System.out.print("Sum is : " +sum);
    }
}
