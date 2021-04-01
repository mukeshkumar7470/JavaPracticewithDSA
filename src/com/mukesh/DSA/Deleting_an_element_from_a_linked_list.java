package com.mukesh.DSA;

/*------------------Algorithm for Delete Node-------------------*/
/*
*
*
*
delete(data):
1. Find the node with the given data. If found,
   a. If the node to be deleted is head node, make the next node as head node
      i.   If it is also the tail node, make the tail node as null
   b. Otherwise,
      i.   Traverse till the node before the node to be deleted, call it nodeBefore
      ii.  Make link of nodeBefore refer to link of node to be deleted.
      iii. If the node to be deleted is the tail node, call the nodeBefore as tail node
      iv.  Make the link of the node to be deleted as null
2. If the node to be deleted is not found, display appropriate error message

*
*
* */

class DeleteNode {
    private String data;
    private DeleteNode next;

    public DeleteNode(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(DeleteNode node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public DeleteNode getNext() {
        return this.next;
    }
}

public class Deleting_an_element_from_a_linked_list {

    private DeleteNode head;
    private DeleteNode tail;

    public DeleteNode getHead() {
        return this.head;
    }

    public DeleteNode getTail() {
        return this.tail;
    }

    public void addAtEnd(String data) {
        // Create a new node
        DeleteNode node = new DeleteNode(data);

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
        DeleteNode node = new DeleteNode(data);

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
        DeleteNode temp = this.head;
        // Traverse the list and print data of each node
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public DeleteNode find(String data) {
        DeleteNode temp = this.head;
        // Traverse the list and return the node
        // if the data of it matches with the searched data
        while (temp != null) {
            if (temp.getData().equals(data))
                return temp;
            temp = temp.getNext();
        }
        return null;
    }

    public void insert(String data, String dataBefore) {
        DeleteNode node = new DeleteNode(data);
        // Check if the list is empty,
        // if yes, make the node as the head and the tail
        if (this.head == null)
            this.head = this.tail = node;
        else {
            // Find the node after which the data has to be inserted
            DeleteNode nodeBefore = this.find(dataBefore);
            if (nodeBefore != null) {
                // Insert the new node after nodeBefore
                node.setNext(nodeBefore.getNext());
                nodeBefore.setNext(node);
                // If nodeBefore is currently the tail node,
                // make the new node as the tail node
                if (nodeBefore == this.tail)
                    this.tail = node;
            } else
                System.out.println("DeleteNode not found");
        }
    }

    public void delete(String data) {
        // Check if the list is empty,
        // if yes, make the node as the head and the tail
        if (this.head == null)
            System.out.println("List is empty");
        else {
            // Find the node to be deleted
            DeleteNode node = this.find(data);
            // If the node is not found
            if (node == null)
                System.out.println("DeleteNode not found");
                // If the node to be deleted is the head node
            else if (node == this.head) {
                this.head = this.head.getNext();
                node.setNext(null);
                // If the node to be deleted is also the tail node
                if (node == this.tail)
                    tail = null;
            } else {
                // Traverse to the node present before the node to be deleted
                DeleteNode nodeBefore = null;
                DeleteNode temp = this.head;
                while (temp != null) {
                    if (temp.getNext() == node) {
                        nodeBefore = temp;
                        break;
                    }
                    temp = temp.getNext();
                }
                // Remove the node
                nodeBefore.setNext(node.getNext());
                // If the node to be deleted is the tail node,
                // then make the previous node as the tail
                if (node == this.tail)
                    this.tail = nodeBefore;
                node.setNext(null);
            }
        }
    }

    public static void main(String args[]) {
        Deleting_an_element_from_a_linked_list list = new Deleting_an_element_from_a_linked_list();
        list.addAtEnd("Milan");
        list.addAtEnd("Venice");
        list.addAtEnd("Munich");
        list.addAtEnd("Prague");
        list.addAtEnd("Vienna");
        list.display();
        System.out.println("--------------------------");
        list.delete("Venice");
        list.display();

        /*
         * if(list.find("Munich")!=null) System.out.println("DeleteNode found"); else
         * System.out.println("DeleteNode not found");
         */
    }
}
