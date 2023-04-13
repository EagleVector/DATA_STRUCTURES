package com.cherry.DataStructures.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackInBuilt {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(17);
        stack.push(21);
        stack.push(29);
        stack.push(32);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(15);
        queue.add(46);
        queue.add(67);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }

}
