package com.mukesh.introductionToOOPs;

public class Abstration {
    public static void main(String args[]) {
        Customer customer = new Customer();
        customer.customerName = "Jack";
        customer.payBill(500, 5);
    }

   private static class Customer {
        String customerName;

        public void payBill(double totalPrice, double discount) {
            System.out.println("Calculating final amount to be paid.....");
            double priceAfterDiscount = totalPrice * (1 - (discount / 100));
            System.out.println("Hi " + customerName
                    + ", your final bill amount after discount is "
                    + (int) (priceAfterDiscount * 100) / 100.0);
        }

    }
}
