package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Animal x = new Animal(12, "Henry");
//
//        x.Speak();
//        x.Info();
//
//        Giraffe g = new Giraffe(8, "Gregory");
//
//        g.Speak();
//        g.Info();
//        g.Lick();

        LinkedListMain();
    }


    public static void LinkedListMain(){

        Node myNode = new Node("Kayla");
        Node node2 = new Node("Justin");
        Node node3 = new Node("Brandon");
        Node node4 = new Node("Pedro");
        Node node5 = new Node("Pam");
        Node node6 = new Node("Eric");
        Node node7 = new Node("Melinda");

        myNode.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;


        Node head = myNode;

//        while(head != null){
//
//            System.out.println(head.data);
//            head = head.next;
//
//        }

        head = myNode;
        Node temp = myNode;
//
        while(temp != null) {

            if (temp.next != null){
                temp = temp.next.next;
                head = head.next;
            }
            else
                temp = temp.next;
        }

        System.out.println(head.data);


    }



}
