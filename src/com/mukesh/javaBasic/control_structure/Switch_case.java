package com.mukesh.javaBasic.control_structure;

public class Switch_case {
    public static void main(String[] args) {
        double discount;
        String customerType = "Premium";
        switch (customerType) {
            case "Regular":
                discount = 5;
                System.out.println("Customer has got discount of " + discount + "%");
                break;

            case "Premium":
                discount = 10;
                System.out.println("Customer has got discount of " + discount + "%");
                break;

            default:
                discount = 0;
                System.out.println("Customer has got discount of " + discount + "%");
                break;
        }

    }
}
