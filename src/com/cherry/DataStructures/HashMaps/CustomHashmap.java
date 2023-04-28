package com.cherry.DataStructures.HashMaps;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
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

        private int hashFunction(K key) { // 0 to N - 1
            int bucketIndex = key.hashCode();
            return Math.abs(bucketIndex) % N;
        }


        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIndex);

            if (dataIdx == -1) {
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }
            else {
                Node node = buckets[bucketIndex].get(dataIdx);
                node.value = value;
            }
            double lambda = (double)n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        private int searchInLL(K key, int bucketIndex) {
            LinkedList<Node> ll = buckets[bucketIndex];

            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public V get(K key) {
            int bucketIndex = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIndex);

            if (dataIdx == -1) {
                return null;
            }
            else {
                Node node = buckets[bucketIndex].get(dataIdx);
                return node.value;
            }
        }
        public boolean containsKey(K key) {
            int bucketIndex = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIndex);

            if (dataIdx == -1) {
                return false;
            }
            else {
                return true;
            }
        }
        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            int dataIdx = searchInLL(key, bucketIndex);

            if (dataIdx == -1) {
                return null;
            }
            else {
                Node node = buckets[bucketIndex].remove(dataIdx);
                n--;
                return node.value;
            }
        }
        public boolean isEmpty() {
            return n==0;
        }
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("USA", 35);
        map.put("Japan", 15);
        map.put("Pak", 35);
        map.put("Nepal", 10);

        ArrayList<String> keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " : " + map.get(keys.get(i)));
        }

        map.remove("China");
        System.out.println(map.get("China"));
    }
}