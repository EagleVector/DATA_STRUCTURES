package com.cherry.DataStructures.HashMaps;

import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        // Create
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        System.out.println(set);

        // Search
        if (set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if (!set.contains(5)){
            System.out.println("Set does not contain 5");
        }

        // Delete

        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("1 removed from Set");
        }
        System.out.println(set);

//        Check the size of set.

        System.out.println(set.size());

//        Iterator

//        Iterator next() and hasNext()

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        HashMap<String, Integer> map = new HashMap<>();
//        Insert into the map
        map.put("India", 150);
        map.put("China", 140);
        map.put("USA", 30);
        map.put("Japan", 4);

        System.out.println(map);

        map.remove("China");
        System.out.println(map);
        map.replace("India", 150, 160);
        System.out.println(map);
        System.out.println(map.get("USA"));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey("USA"));
        System.out.println(map.get("India"));
        map.put("Australia", 2);
        map.put("Pakistan", 35);
        map.put("Germany", 15);
        map.put("UK", 5);
        System.out.println(map);

        int[] arr = {1, 2, 3, 4, 5};

//        For loop using collections framework
        for (int i : arr) {
            System.out.println(i);
        }

//        Iterating through the hashmap using collection framework for loop
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
