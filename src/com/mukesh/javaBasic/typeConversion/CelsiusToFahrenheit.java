package com.mukesh.javaBasic.typeConversion;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main (String args[]) {

        float Fahrenheit, Celsius;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        Celsius = s.nextFloat();

        Fahrenheit =((Celsius*9)/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);
    }
}
