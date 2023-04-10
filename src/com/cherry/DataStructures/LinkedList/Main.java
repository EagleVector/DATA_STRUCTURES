package com.cherry.DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
//        CustomLinkedList list = new CustomLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(8);
//        list.insertFirst(11);
//        list.insertFirst(15);
//        list.insertLast(12);
//        list.insertLast(15);
//        list.insertLast(8);
//        list.insertLast(3);
//        list.insert(1, 4);
//        list.display();
//        System.out.println();
//        list.deleteFirst();
//        list.display();
//        System.out.println();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println();
//        System.out.println(list.delete(1));
//        System.out.println();
//        list.display();
//        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(8);
//        list.insertFirst(11);
//        list.insertFirst(15);
//        list.insertLast(34);
////        list.RevDisplay();
//        list.insert(11, 65);
//        list.RevDisplay();
        CircularLinkedList list = new CircularLinkedList();
        list.insert(12);
        list.insert(23);
        list.insert(32);
        list.insert(59);
        list.delete(23);
        list.display();
    }
}
