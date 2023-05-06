package com.cherry.DataStructures.TwoPointersSlidingWindow;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SlidingWin {
    public static void main(String[] args) {
//        String str = "qrsvbspk";
//        int ans = longestString(str);
//        System.out.println(ans);
    }

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
