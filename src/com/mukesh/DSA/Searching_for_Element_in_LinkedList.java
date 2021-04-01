package com.mukesh.DSA;

/*------------------Algorithm for search Element-------------------*/
/*

find(data)
1.Take a temp reference and assign it with head node
2.While temp is not null,
  a.If the data at temp is equal to the data being searched for then, return temp
  b.Else, make the next node as temp
3.If data is not found then, return null

*/


class SearchingNode {
    private String data;
    private SearchingNode next;

    public SearchingNode(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(SearchingNode node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public SearchingNode getNext() {
        return this.next;
    }
}

public class Searching_for_Element_in_LinkedList {

    private SearchingNode head;
    private SearchingNode tail;

    public SearchingNode getHead() {
        return this.head;
    }

    public SearchingNode getTail() {
        return this.tail;
    }

    public void addAtEnd(String data) {
        // Create a new node
        SearchingNode node = new SearchingNode(data);

        // Check if the list is empty,
        // if yes, make the node as the head and the tail
        if (this.head == null)
            this.head = this.tail = node;
        else {
            // If the list is not empty, add the element at the end
            this.tail.setNext(node);
            // Make the new node as the tail
            this.tail = node;
        }

    }

    public void addAtBeginning(String data) {
        // Create a new node
        SearchingNode node = new SearchingNode(data);

        // Check if the list is empty,
        // if yes, make the node as the head and the tail
        if (this.head == null)
            this.head = this.tail = node;
        else {
            // If the list is not empty, add the element at the beginning
            node.setNext(this.head);
            // Make the new node as the head
            this.head = node;
        }

    }

    public void display() {
        // Initialize temp to the head node
        SearchingNode temp = this.head;
        // Traverse the list and print data of each node
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public SearchingNode find(String data) {
        SearchingNode temp = this.head;
        // Traverse the list and return the node
        // if the data of it matches with the searched data
        while (temp != null) {
            if (temp.getData().equals(data))
                return temp;
            temp = temp.getNext();
        }
        return null;
    }

    public static void main(String args[]) {
        Searching_for_Element_in_LinkedList list = new Searching_for_Element_in_LinkedList();
        list.addAtEnd("Milan");
        list.addAtEnd("Venice");
        list.addAtEnd("Munich");
        list.addAtEnd("Vienna");
        list.addAtBeginning("Mukesh");

        list.display();

        if (list.find("Mukesh") != null)
            System.out.println("SearchingNode found");
        else
            System.out.println("SearchingNode not found");
    }
}
