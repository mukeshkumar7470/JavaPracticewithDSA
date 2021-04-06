package com.mukesh.javaBasic.polymorphism;

class ConsOverCustomer {
    private String customerId;
    private String customerName;
    private long contactNumber;
    private String address;
    // Parameterless constructor
    public ConsOverCustomer() {
        System.out.println("Inside parameterless constructor");
    }
    // Parameterized constructor
    public ConsOverCustomer(String customerId, String customerName, long contactNumber,
                    String  address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }
    // Parameterized constructor
    public ConsOverCustomer(String customerName, long contactNumber, String address) {
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }
    // Methods including getter and setter and other methods
}


public class ConstructorOverloading {
    public static void main(String[] args) throws Exception {
		/*
		 Parameterless constructor will be invoked, instance variables should
		 be initialized using setter methods
		 */
        ConsOverCustomer customerOne = new ConsOverCustomer();
		/*
		 Parameterized constructor with four parameters instance variables are
		 initialized in the constructor
		 */

		/*
		 Parameterized constructor with three parameters instance variables
		 are initialized in the constructor
		 */

    }
}
