package com.cherry.DataStructures.HashMaps;

import com.cherry.DataStructures.Trees.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class InterviewProblems {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//        frequencyEle(arr);
//        int[] arr1 = {7, 3, 9};
//        int[] arr2 = {6, 3, 9, 2, 9, 4};
//        arrUnion(arr1, arr2);
//        int[] arr1 = {7, 3, 9};
//        int[] arr2 = {6, 3, 9, 2, 9, 4};
//        int ans = arrIntersection(arr1, arr2);
//        System.out.println(ans);
//        String s = "car";
//        String t = "rat";
//        boolean ans = isAnagram(s, t);
//        System.out.println(ans);
//        HashMap<String, String> map = new HashMap<>();
//        map.put("Chennai", "Bengaluru");
//        map.put("Mumbai", "Delhi");
//        map.put("Goa", "Chennai");
//        map.put("Delhi", "Goa");
//
//        String start = getStart(map);
//
//        while(map.containsKey(start)) {
//            System.out.print(start + " ---> ");
//            start = map.get(start);
//        }
//        System.out.print(start);
//        int[] arr = {1, 1, 1, 2, 2, 3};
//        int k = 2;
//        int[] res = topFrequency(arr, k);
//        System.out.println(Arrays.toString(res));
        int[] arr = {1, 2, 3, 4};
        int[] ans = productArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] productArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int product = 1;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            product = product * arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i] = product / arr[i];
        }
        return ans;
    }
}

//    private static int[] topFrequency(int[] arr, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int[] ans = new int[k];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            }
//            else {
//                map.put(arr[i], 1);
//            }
//        }
//        while (k > 0) {
//            int maxCount = Integer.MIN_VALUE;
//            int maxNum = -1;
//            for (int key : map.keySet()) {
//                int count = map.get(key);
//                if (count > maxCount) {
//                    maxCount = count;
//                    maxNum = key;
//                }
//            }
//            ans[k - 1] = maxNum;
//            map.remove(maxNum);
//            k--;
//        }
//        return ans;
//    }
//}

//    private static String getStart(HashMap<String, String> map) {
//        HashMap<String, String> revMap = new HashMap<>();
//        for (String key : map.keySet()) {
//            revMap.put(map.get(key), key);
//        }
//
//        for (String key : map.keySet()) {
//            if (!revMap.containsKey(key)) {
//                return key;
//            }
//        }
//        return null;
//    }

//    private static boolean isAnagram(String s, String t) {
//        char[] arr1 = s.toCharArray();
//        char[] arr2 = t.toCharArray();
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (map1.containsKey(arr1[i])) {
//                map1.put(arr1[i], map1.get(arr1[i]) + 1);
//            }
//            else {
//                map1.put(arr1[i], 1);
//            }
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            if (map2.containsKey(arr2[i])) {
//                map2.put(arr2[i], map2.get(arr1[i]) + 1);
//            }
//            else {
//                map2.put(arr2[i], 1);
//            }
//        }
//        if (map1.equals(map2)) {
//            return true;
//        }
//        return false;
//    }

//    private static int arrIntersection(int[] arr1, int[] arr2) {
//        HashSet<Integer> set = new HashSet<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int count = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr1.length; i++) {
//            set.add(arr1[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            if (set.contains(arr2[i])) {
//                count++;
//                list.add(arr2[i]);
//                set.remove(arr2[i]);
//            }
//        }
//        System.out.println(list);
//        return count;
//    }


//    private static void arrUnion(int[] arr1, int[] arr2) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr1.length; i++) {
//            set.add(arr1[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            set.add(arr2[i]);
//        }
//        System.out.println(set.size());
//        System.out.println(set);

//    private static void arrUnion(int[] arr1, int[] arr2) {
//        int m = arr1.length;
//        int n = arr2.length;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        int[] result = new int[m + n];
//        int i;
//        for (i = 0; i < m; i++) {
//            result[i] = arr1[i];
//        }
//        for (int j = 0; j < n; j++) {
//            result[i + j] = arr2[j];
//        }
//        System.out.println(Arrays.toString(result));
//
//        for (int k = 0; k < result.length; k++) {
//            if (map.containsKey(result[k])) {
//                map.put(result[k], map.get(result[k]) + 1);
//            }
//            else {
//                map.put(result[k], 1);
//            }
//        }
//        System.out.println(map);
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int key : map.keySet()) {
//            list.add(key);
//        }
//        System.out.println(list);
//    }

//    private static void frequencyEle(int[] arr) {
//        int n = arr.length;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            }
//            else {
//                map.put(arr[i], 1);
//            }
//        }
//        for (int key : map.keySet()) {
//            if (map.get(key) > n / 3) {
//                System.out.println(key);
//            }
//        }
//    }

//    private static void frequencyEle(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            System.out.println(arr[i] + " : " + count);
//        }
//    }
