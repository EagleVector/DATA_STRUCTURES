package com.cherry.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class SlideWindow {
    public static void main(String[] args) {
//        int[] arr = {2, 5, 3, 5, 4, 2, 3};
//        int x = 3;
//        int y = 2;
//        int answer = minimumdist(arr, x, y);
//        System.out.println(answer);
//        int[] arr = {1, -2, -6, 3, -1, 2, 4, 8, -12};
//        int sum = larcontssubarrsum(arr);
//        System.out.println(sum);
//        System.out.println(larcontssubarr(arr));
//        int[] arr = {1, 2, 3, 4};
//        printsubarrays(arr);
//        int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        int[] arr2 = {3, 4, 5, 6, 7};
//        int[] arr3 = {1, 2, 3, 4, 5};
//        int[] arr4 = {0, 1, 2, 3, 4};
//        int l1 = arr1.length;
//        int l2 = arr2.length;
//        int l3 = arr3.length;
//        int l4 = arr4.length;
//
//        int[] list = new int[l1 + l2 + l3 + l4];
//        for (int i = 0; i < arr1.length; i++) {
//            list[i] = arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            list[arr1.length + i] = arr2[i];
//        }
//        for (int i = 0; i < arr3.length; i++) {
//            list[arr1.length + arr2.length + i] = arr3[i];
//        }
//        for (int i = 0; i < arr4.length; i++) {
//            list[arr1.length + arr2.length + arr3.length + i] = arr4[i];
//        }
//        System.out.println(Arrays.toString(list));
//
//        int[] nw = new int[list.length];
//
//        for (int i = 0; i < list.length; i++) {
//            nw[list[i]]++;
//        }
//
//        int max = nw[0];
//        int i = 0;
//        for (; i < nw.length - 1; i++) {
//
//            if (nw[i + 1] > nw[i]) {
//                max = nw[i + 1];
//            }
//        }
//        System.out.println(Arrays.toString(nw));
//        System.out.println(max);
//
//        for (int j = 0; j < nw.length; j++) {
//            if (nw[j] == max) {
//                System.out.println(j);
//                break;
//            }
//        }

//        int max = nw[0];
//
//        for (int i = 0; i < nw.length; i++) {
//            if (nw[i] >= max) {
//                max = nw[i];
//            }
//        }
//        ArrayList<Integer> listx = new ArrayList<>();
//
//        for (int i = 0; i < nw.length; i++) {
//            if (nw[i] == max) {
//                listx.add(i);
//            }
//        }
//        System.out.println(listx);
//        System.out.println(listx.get(0));
//        System.out.println(max);
    }

//    public static void printsubarrays(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                int[] subarr = Arrays.copyOfRange(arr, i, j + 1);
//                System.out.println(Arrays.toString(subarr));
//            }
//        }
//    }

//    public static int larcontssubarrsum(int[] arr) {
//        int max_sum = 0;
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//            if (sum < 0 || sum == 0) {
//                sum = 0;
//            }
//            max_sum = Math.max(max_sum, sum);
//        }
//        return max_sum;
//    }

//    public static ArrayList<Integer> larcontssubarr(int[] arr) {
//        int max_sum = 0;
//        int sum = 0;
//
//        ArrayList<Integer> list= new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//            list.add(arr[i]);
//            if (sum < 0 || sum == 0) {
//                sum = 0;
//                list.clear();
//            }
//            max_sum = Math.max(max_sum, sum);
//        }
//        for (int idx = list.size() - 1; idx >= 0; idx--) {
//            if (list.get(idx) >= 0) {
//                break;
//            }
//            else {
//                list.remove(idx);
//            }
//        }
//        return list;
//    }

//    public static int minimumdist(int[] arr, int x, int y) {
//        int prev = -1;
//        int min_dist = Integer.MAX_VALUE;
//        int i = 0;
//
//        for (i = 0; i < arr.length; i++) {
//            if (arr[i] == x || arr[i] == y) {
//                prev = i;
//                break;
//            }
//        }
//
//        for (; i < arr.length; i++) {
//            if (arr[i] == x || arr[i] == y) {
//                if (arr[prev] != arr[i] && (i - prev) < min_dist) {
//                    min_dist = i - prev;
//                }
//                prev = i;
//            }
//        }
//        return min_dist;
//    }
}
