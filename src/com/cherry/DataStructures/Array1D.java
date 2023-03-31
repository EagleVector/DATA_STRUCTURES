package com.cherry.DataStructures;

import java.util.Arrays;

public class Array1D {
    public static void main(String[] args) {
        int[] A = {1, 0 , 5, 0, 0, 10, 0};
        int[] B = {3, 9, 12, 14};
        System.out.println(Arrays.toString(mergingarr(A, B)));
        int[] arr = mergingarr(A, B);
        System.out.println(Arrays.toString(sorting(arr)));
    }

    static int[] sorting(int[] arr) {
        int start = 0;
        int end = arr.length;

        for (int i = start; i < end; i++) {
            for (int j = i; j < end - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapidx(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    static void swapidx(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int[] mergingarr(int[] a, int[] b) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = b[j];
                j++;
            }
        }
        return a;
    }

}
