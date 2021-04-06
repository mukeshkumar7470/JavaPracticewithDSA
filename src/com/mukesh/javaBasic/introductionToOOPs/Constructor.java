package com.mukesh.javaBasic.introductionToOOPs;

 class Customers {
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;

	public Customers() {
		System.out.println("Parameterless constructor called");
	}

    public Customers(String cId, String cName, long contact, String add) {
        System.out.println("Parameterized constructor called");
        customerId = cId;
        customerName = cName;
        contactNumber = contact;
        address = add;
    }
}


public class Constructor {
    public static void main(String args[]) {
        //the below line will lead to an error as there is no default constructor
        Customers customer2 = new Customers();
        //if a parameterized constructor is created in a class, java doesn't create a default constructor
        //uncomment the parameterless constructor and then execute the code

        //the below code leads to an error as the parameters accepted by the constructor does not match the parameters passed
        Customers customer1 = new Customers("001", "Mukesh", 78045678, "lobedsadafa");
        //the order and type of the parameters passed for a parameterized constructor should match the definition properly

    }
}
