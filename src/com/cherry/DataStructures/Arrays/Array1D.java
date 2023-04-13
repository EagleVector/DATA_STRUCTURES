package com.cherry.DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Time Complexity: O((M + N)^2)
// No extra space taken.
//Space Complexity is O(1).

public class Array1D {
    public static void main(String[] args) {
//        int[] A = {1, 2, 3, 9, 0, 0, 0, 0, 0, 0};
//        int[] B = {2, 5, 6, 7, 8, 12};
//        int m = 4;
//        int n = 6;
//        System.out.println(Array.toString(mergetwoarrays(A, B, m, n)));

//        System.out.println(Array.toString(mergingarr(A, B)));
//        int[] arr = mergingarr(A, B);
//        System.out.println(Array.toString(sorting(arr)));

//        System.out.println(Array.toString(movearr(A)));
//        int[] arr = movearr(A);
//        mergingthearrays(arr, B, arr.length - 1, B.length - 1);
        int[] arr = {12, 12, 24};
        int children = 6;
        System.out.println(choclateproblem(arr, children));
    }

    public static boolean choclateproblem(int[] boxes, int count) {
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] % count != 0) {
                return false;
            }
        }
        return true;
    }

//    public static int[] mergetwoarrays(int[] a, int[] b, int m, int n) {
//        int i = m - 1;
//        int j = n - 1;
//        int s = m + n - 1;
//        while (i >= 0 && j >= 0) {
//            if (a[i] > b[j]) {
//                a[s] = a[i];
//                i--;
//            }
//            else {
//                a[s] = b[j];
//                j--;
//            }
//            s--;
//        }
//        while (i >= 0) {
//            a[s] = a[i];
//            s--;
//            i--;
//        }
//        while (j >= 0) {
//            a[s] = a[j];
//            s--;
//            j--;
//        }
//
//        return a;
//    }

//    public static void mergingthearrays(int[] arr, int[] b, int l1, int l2) {
//        int l3 = l1 + l2 - 1;
//        while (l1 >= 0 || l2 >= 0) {
//            if (arr[l1] > b[l2]) {
//                int temp = arr[l3];
//                arr[l3] = arr[l1];
//                arr[l1] = temp;
//                l1--;
//            }
//            else {
//
//            }
//        }
//    }

//    public static int[] movearr(int[] a) {
//        int j = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] != 0) {
//                int temp = a[j];
//                a[j] = a[i];
//                a[i] = temp;
//
//                j++;
//            }
//        }
//        return a;
//    }

//    static int[] sorting(int[] arr) {
//        int start = 0;
//        int end = arr.length;
//
//        for (int i = start; i < end; i++) {
//            for (int j = i; j < end - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    swapidx(arr, j, j + 1);
//                }
//            }
//        }
//        return arr;
//    }
//
//    static void swapidx(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//
//    static int[] mergingarr(int[] a, int[] b) {
//        int j = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 0) {
//                a[i] = b[j];
//                j++;
//            }
//        }
//        return a;
//    }

}
