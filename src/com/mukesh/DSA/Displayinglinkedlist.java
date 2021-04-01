package com.mukesh.DSA;

/* ---------------------------------Algorithm------------------------------------*/
/*add(data)
1.Create a new node with the given data
2.If the linked list is empty, then make this new node the head and the tail node
3.Else,
  a.Make the link of the tail node refer to the new node
  b.Make the tail refer to the new node

 -------for display data-------

display()
1.Take a temp reference and assign it with the head node
2.While temp is not null,
  a.Display the data at the temp node
  b.Make the next node as temp

*/


class DisplayNodes {
    private String data;
    private DisplayNodes next;

    public DisplayNodes(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(DisplayNodes node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public DisplayNodes getNext() {
        return this.next;
    }
}

public class Displayinglinkedlist {


    private DisplayNodes head;
    private DisplayNodes tail;

    public DisplayNodes getHead() {
        return this.head;
    }

    public DisplayNodes getTail() {
        return this.tail;
    }

    public void addAtEnd(String data) {
        // Create a new node
        DisplayNodes node = new DisplayNodes(data);

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
        DisplayNodes node = new DisplayNodes(data);

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
        DisplayNodes temp = this.head;
        // Traverse the list and print data of each node
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public static void main(String args[]) {
        Displayinglinkedlist list = new Displayinglinkedlist();
        list.addAtEnd("Milan");
        list.addAtEnd("Venice");
        list.addAtEnd("Munich");
        list.addAtEnd("Vienna");
        list.addAtEnd("Mukesh");
        list.addAtBeginning("Mukesh");
        list.display();
    }
}
