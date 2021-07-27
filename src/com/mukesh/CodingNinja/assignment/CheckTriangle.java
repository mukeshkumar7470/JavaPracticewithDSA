package com.mukesh.CodingNinja.assignment;

public class CheckTriangle {
    // Driver Code
    public static void main(String[] args)
    {

        // Given sides of triangle
        int x = 8, y = 7, z = 9;

        // Function call
        checkTriangle(x, y, z);
    }

    private static void checkTriangle(int x, int y, int z) {
        // Check for equilateral triangle
        if (x == y && y == z )
            System.out.println("Equilateral Triangle");

            // Check for isosceles triangle
        else if (x == y || y == z || z == x )
            System.out.println("Isosceles Triangle");

            // Otherwise scalene triangle
        else
            System.out.println("Scalene Triangle");
    }
}
