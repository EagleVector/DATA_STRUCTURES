package com.cherry.DataStructures.LinkedList;

import java.util.LinkedList;

public class LiveLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Sunny");
        list.add("Bunny");
        list.add(1, "Cherry");
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(1, "Derry");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}

