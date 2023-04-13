package com.cherry.DataStructures.StackAndQueue;

public class Main {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack(3);
        stack.push(12);
        stack.push(21);
        stack.push(32);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
