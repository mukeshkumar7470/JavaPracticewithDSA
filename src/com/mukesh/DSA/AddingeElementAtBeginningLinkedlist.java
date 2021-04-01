package com.mukesh.DSA;


class Nodes {
    private String data;
    private Nodes next;

    public Nodes(String data){
        this.data=data;
    }
    public void setData(String data){
        this.data = data;
    }
    public void setNext(Nodes node){
        this.next = node;
    }
    public String getData(){
        return this.data;
    }
    public Nodes getNext(){
        return this.next;
    }
}

class LinkedLists {

    private Nodes head;
    private Nodes tail;

    public Nodes getHead(){
        return this.head;
    }
    public Nodes getTail(){
        return this.tail;
    }
    public void addAtEnd(String data){
        //Create a new node
        Nodes node = new Nodes(data);

        //Check if the list is empty,
        //if yes, make the node as the head and the tail
        if(this.head == null)
            this.head=this.tail=node;
        else{
            //If the list is not empty, add the element at the end
            this.tail.setNext(node);
            //Make the new node as the tail
            this.tail=node;
        }

    }


    public void addAtBeginning(String data){
        //Implement your code here

        // Create a new node
        Nodes node = new Nodes(data);

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

}

public class AddingeElementAtBeginningLinkedlist {

    public static void main(String args[]){
        LinkedLists list = new LinkedLists();
        list.addAtEnd("Milan");
        list.addAtEnd("Venice");
        list.addAtEnd("Munich");
        list.addAtBeginning("Nice");
    }

}
