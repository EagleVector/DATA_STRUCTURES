package com.cherry.DataStructures;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 5, 3, 9, 7, 12, 4};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        for (int j = arr.length - 1; j >= 0; j--) {
//            System.out.print(arr[j] + " ");
//        }
//        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9};
//        int[] arrr = {1, 2, 3, 4, 5, 6, 7, 8};
//        int ans = edgecasemissingelement(arrr);
//        System.out.println(ans);
//        int[] arr = {9, 2, 4, 1, 6, 7, 5, 8};
//        int answer = missingele(arr);
//        System.out.println(answer);

//        Mathematical soln.
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//
//        int l1 = arr.length + 1;
//        int l2 = arr.length + 2;
//
//        int total = (l1 * l2) / 2;
//
//        int diff = total - sum;
//        System.out.println(diff);

        int[] arr = {3, 7, 4, 8, 6, 2, 1};
    }


//    public static int missingele(int[] arr) {
//        int [] soln = new int[arr.length + 1];
//
//        for (int i = 0; i < arr.length; i++) {
//            int k = arr[i];
//            soln[k - 1] = 1;
//        }
//        for (int j = 0; j < soln.length; j++) {
//            if (soln[j] != 1) {
//                return j + 1;
//            }
//        }
//        return -1;
//    }



//    public static void swapidx(int[] array, int first, int second) {
//        int temp = array[first];
//        array[first] = array[second];
//        array[second] = temp;
//    }

//    private static int edgecasemissingelement(int[] arrr) {
//
////        Edge Case
//        if (arrr[arrr.length - 1] == arrr.length) {
//            return arrr.length + 1;
//        }
//        for (int i = 0; i < arrr.length; i++) {
//            if (arrr[i] != i + 1) {
//                return i + 1;
//            }
//        }
//        return -1;
//    }

//    public static int missingelement(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != i + 1) {
//                return i + 1;
//            }
//        }
//        return -1;
//    }
}
