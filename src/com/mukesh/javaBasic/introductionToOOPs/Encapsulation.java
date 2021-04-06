package com.mukesh.javaBasic.introductionToOOPs;

class CustomerData {
    // Private member variables
    private String customerId;
    private String customerName;
    private long contactNumber;
    private String address;

    // Public getter and setter methods
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Encapsulation {

    public static void main(String args[]) {
        CustomerData customer = new CustomerData();

        // Creating object of CustomerData class
        customer.setCustomerId("C101");

        // Setting values of the instance variables using setter methods
        customer.setCustomerName("Jack");
        customer.setContactNumber(9870345687L);
        customer.setAddress("D089, St. Louis Street, Springfield");

        System.out.println("Displaying CustomerData Details");
        // Displaying values of the instance variables using getter methods
        System.out.println("CustomerData Id : " + customer.getCustomerId());
        System.out.println("CustomerData Name : " + customer.getCustomerName());
        System.out.println("Contact Number : " + customer.getContactNumber());
        System.out.println("Address : " + customer.getAddress());
    }


}
