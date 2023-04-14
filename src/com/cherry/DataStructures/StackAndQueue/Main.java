package com.cherry.DataStructures.StackAndQueue;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomStack stack = new CustomStack(3);
//        stack.push(12);
//        stack.push(21);
//        stack.push(32);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        DynamicStack stack = new DynamicStack(3);
//        stack.push(12);
//        stack.push(21);
//        stack.push(32);
//        stack.push(11);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(2);
//        queue.insert(1);
//        queue.insert(4);
//        queue.insert(3);
//        queue.insert(5);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//
//        queue.display();
//        CircularQueue queue = new CircularQueue(3);
//        queue.insert(34);
//        queue.insert(54);
//        queue.insert(23);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//
//        queue.display();
//
//        queue.insert(45);
//
//        queue.display();
        DynamicQueue queue = new DynamicQueue(3);
        queue.insert(34);
        queue.insert(21);
        queue.insert(49);
        queue.insert(63);
        queue.insert(97);

        queue.display();

        queue.remove();

        queue.display();

        queue.insert(7);

        queue.display();

        queue.remove();

        queue.display();

        queue.insert(87);

        queue.display();

        queue.remove();

        queue.display();

    }
}
