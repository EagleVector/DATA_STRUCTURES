package com.cherry.DataStructures.StackAndQueue;

import java.util.Stack;

public class InterviewProblems {
    public static void main(String[] args) {
//        QueueUsingStack stack = new QueueUsingStack();
////        stack.push(5);
////        System.out.println(stack.pop());
//        stack.add(34);
//        stack.add(21);
//        stack.add(11);
//        stack.add(9);
//        System.out.println(stack.remove());
//        System.out.println(stack.remove());
//        System.out.println(stack.remove());
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());
    }
}

//INSERT EFFICIENT
//class QueueUsingStack {
//    private Stack<Integer> first;
//    private Stack<Integer> second;
//    public QueueUsingStack() {
//        first = new Stack<>();
//        second = new Stack<>();
//    }
//
//    public void add(int item) {
//        first.push(item);
//    }
//    public int remove() {
//        while (!first.isEmpty()) {
//            second.push(first.pop());
//        }
//        int removed = second.pop();
//
//        while (!second.isEmpty()) {
//            first.push(second.pop());
//        }
//        return removed;
//    }
//
//    public int peek() {
//        while (!first.isEmpty()) {
//            second.push(first.pop());
//        }
//        int peeked = second.peek();
//
//        while (!second.isEmpty()) {
//            first.push(second.pop());
//        }
//        return peeked;
//    }
//    public boolean isEmpty() {
//        return first.isEmpty();
//    }
//}

//REMOVE EFFICIENT

//class QueueUsingStack {
//    private Stack<Integer> first;
//    private Stack<Integer> second;
//
//    public QueueUsingStack() {
//        first = new Stack<>();
//        second = new Stack<>();
//    }
//
//    public int remove() {
//        return first.pop();
//    }
//
//    public void add(int item) {
//        while(!first.isEmpty()) {
//            second.push(first.pop());
//        }
//        first.push(item);
//
//        while(!second.isEmpty()) {
//            first.push(second.pop());
//        }
//    }
//
//    public int peek() {
//        return first.peek();
//    }
//
//    public boolean isEmpty() {
//        return first.isEmpty();
//    }
//
//}
