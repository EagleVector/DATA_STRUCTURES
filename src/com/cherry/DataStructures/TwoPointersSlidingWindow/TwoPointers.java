package com.cherry.DataStructures.TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TwoPointers {
    public static void main(String[] args) {
//        int[] arr = {-1, 0, 1, 2, -1, -4};
//        List<List<Integer>> triplets = triplets(arr);
//        for (List<Integer> triplet : triplets) {
//            System.out.println(triplet);
//        }
//        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int maxim = container(height);
//        System.out.println(maxim);
    }

//    BRUTE-FORCE
//    private static int container(int[] height) {
//        int maxArea = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int area = (j - i) * Math.min(height[i], height[j]);
//                maxArea = Math.max(area, maxArea);
//            }
//        }
//        return maxArea;
//    }

//    private static int container(int[] height) {
//        int maxCap = 0;
//        int left = 0;
//        int right = height.length - 1;
//        while (left < right) {
//            int cap = Math.min(height[left], height[right]) * (right - left);
//            maxCap = Math.max(cap, maxCap);
//            if (height[left] <= height[right]) {
//                left++;
//            }
//            else if(height[left] > height[right]) {
//                right--;
//            }
//        }
//        return maxCap;
//    }

//    private static List<List<Integer>> triplets(int[] arr) {
//        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length - 2; i++) {
//            if (i == 0 || arr[i] != arr[i - 1]) {
//                int target = -arr[i];
//                int left = i + 1;
//                int right = arr.length - 1;
//                while (left < right) {
//                    int sum = arr[left] + arr[right];
//                    if (sum == target) {
//                        List<Integer> triplet = new ArrayList<>();
//                        triplet.add(arr[i]);
//                        triplet.add(arr[left]);
//                        triplet.add(arr[right]);
//                        list.add(triplet);
//                        while (left < right && arr[left] == arr[left + 1]) {
//                            left++;
//                        }
//                        while (left < right && arr[right] == arr[right - 1]) {
//                            right--;
//                        }
//                        left++;
//                        right--;
//                    } else if (sum < target) {
//                        left++;
//                    } else {
//                        right--;
//                    }
//                }
//            }
//        }
//        return list;
//    }
}
