package com.mukesh.hackerRank;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}



public class LinkedList {

    public static Node insert(Node head, int data) {
        //Complete this method

        Node n=head;
        Node a=new Node(data);
        if(n==null)
        {
            head=a;
            return head;
        }
        while(n.next!=null)
        {
            n=n.next;
        }
        n.next=a;
        return head;
        //Complete this method
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

}
