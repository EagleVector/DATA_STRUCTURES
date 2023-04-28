package com.cherry.DataStructures.HashMaps;

import java.util.HashMap;
import java.util.LinkedList;

//Implementation of HashMap in Java is done by creating an array of Linked List.
public class CustomHashmap {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int n; // Number of nodes.
        private int N; // Number of buckets.
//        Buckets here are linked lists.
        private LinkedList<Node> buckets[]; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

    }
}
