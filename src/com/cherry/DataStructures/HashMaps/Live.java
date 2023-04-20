package com.cherry.DataStructures.HashMaps;


import java.util.HashMap;
import java.util.HashSet;

public class Live {
    public static void main(String[] args) {
        //    Create a Hashmap
        HashMap<String, Integer> languages = new HashMap<>();
//        Add Elements in hashmap
        languages.put("Java", 8);
        languages.put("JS", 15);
        languages.put("Python", 18);
        languages.put("JS", 30);

        System.out.println(languages);
        int val = languages.get("JS");

        System.out.println(val);

        System.out.println(languages.keySet());
        System.out.println(languages.values());
        System.out.println(languages.entrySet());

//        Replace method is used to change the value associated with a key in hashmap.
        languages.replace("Python", 25);
        System.out.println(languages);
//        Remove will remove the key in the hashmap.
        languages.remove("Python");
        System.out.println(languages);
//        Check if the hashmap is empty.
        System.out.println(languages.isEmpty());
    }

//    Add elements to Hashmaps.

}
