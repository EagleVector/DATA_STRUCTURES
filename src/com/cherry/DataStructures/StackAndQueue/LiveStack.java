package com.cherry.DataStructures.StackAndQueue;

import java.util.Stack;

public class LiveStack {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println(animals);
        System.out.println(animals.pop());
        System.out.println(animals);
        animals.push("Camel");
        animals.push("rat");
        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println(animals.isEmpty());

    }

}
