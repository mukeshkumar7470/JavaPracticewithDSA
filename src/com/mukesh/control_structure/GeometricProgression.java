package com.mukesh.control_structure;

public class GeometricProgression {
    public static void main(String[] args) {
        // Implement your code here
        int a = 2; // starting number
        int r = 2; // Common ratio
        int n = 5; // N th term to be find

        int curr_term;
        for (int i = 0; i < n; i++) {
            curr_term = a * (int)Math.pow(r, i);
            System.out.print(curr_term + " ");
        }

    }
}
