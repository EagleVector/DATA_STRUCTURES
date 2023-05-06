package com.cherry.DataStructures.TwoPointersSlidingWindow;


import java.util.*;

public class SlidingWin {
    public static void main(String[] args) {
//        String str = "qrsvbspk";
//        int ans = longestString(str);
//        System.out.println(ans);
//        String str = "AABABBA";
//        int k = 2;
//        int ans = characterReplace(str, k);
//        System.out.println(ans);
//        String s1 = "adc";
//        String s2 = "dcda";
//
//        boolean ans = permutationStr(s1, s2);
//        System.out.println(ans);
    }

//    private static boolean permutationStr(String s1, String s2) {
//        if (s1.length() > s2.length()) {
//            return false;
//        }
//        int[] hash1 = new int[26];
//        int[] hash2 = new int[26];
//        for (int i = 0; i < s1.length(); i++) {
//            hash1[s1.charAt(i) - 'a']++;
//        }
//        System.out.println(Arrays.toString(hash1));
//        int left = 0;
//        int right = s1.length() - 1;
//        for (;right < s2.length(); right++) {
//            for (int i = left; i <= right; i++) {
//                hash2[s2.charAt(i) - 'a']++;
//            }
//            System.out.println(Arrays.toString(hash2));
//            if (Arrays.equals(hash1, hash2)) {
//                return true;
//            }
//            else {
//                left++;
//                Arrays.fill(hash2, 0);
//            }
//        }
//        return false;
//    }

//    private static int characterReplace(String str, int k) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        int res = 0;
//        int left = 0;
//
//        for (int right = 0; right < str.length(); right++) {
//            map.put(str.charAt(right), map.getOrDefault(str.charAt(right), 0) + 1);
//
//            while (((right - left + 1) - Collections.max(map.values()) > k)) {
//                map.put(str.charAt(left), map.get(str.charAt(left)) - 1);
//                left++;
//            }
//            res = Math.max(right - left + 1, res);
//        }
//        return res;
//    }

//    private static int longestString(String str) {
//        HashSet<Character> set = new HashSet<>();
//        int left = 0;
//        int len = 0;
//        for (int right = 0; right < str.length(); right++) {
//            if (set.contains(str.charAt(right))) {
//                set.remove(str.charAt(left));
//                left = left + 1;
//            }
//            set.add(str.charAt(right));
//            len = Math.max(len, set.size());
//        }
//        return len;
//    }

//    private static int longestString(String str) {
//        List<Character> subStr = new ArrayList<>();
//        int longest = 0;
//        for (int right = 0; right < str.length(); right++) {
//            if (subStr.contains(str.charAt(right))) {
//                int index = subStr.indexOf(str.charAt(right));
//                subStr.remove(index);
//                if (index > 0) {
//                    subStr.subList(0, index).clear();
//                }
//            }
//            subStr.add(str.charAt(right));
//            longest = Math.max(longest, subStr.size());
//        }
//        return longest;
//    }
}
