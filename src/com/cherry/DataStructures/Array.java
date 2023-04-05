package com.cherry.DataStructures;

import java.util.*;

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

//        convert the array into zig-zag fashion.

//        int[] arr = {4, 3, 7, 8, 6, 2, 1};
//        int[] soln = zigzag(arr);
//        System.out.println(Arrays.toString(soln));
//        int[] arr1 = {2, 3, 6, 8};
//        int[] arr2 = {10, 20, 30, 40, 50};
//
//        int[] arr = mergearray(arr1, arr2);
//        System.out.println(Arrays.toString(arr));

//        int[] arr = {1, 2, 3};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                for (int k = i; k <= j; k++) {
//                    System.out.print(arr[k] + " ");
//                }
//                System.out.println();
//            }
//        }
//        int[] arr = {4, 3, 1, 2, 5};
//        int k = 4;
//        int answer = subarrays(arr, k);
//        System.out.println(answer);
//        int[] arr = {1, 1, 1};
//        int k = 2;
//        int answer = subarraysum(arr, k);
//        System.out.println(answer);
//        int[] arr = {2, 4, 5, 7, 8};
//        int[] answer = multiprevnext(arr);
//        System.out.println(Arrays.toString(answer));
//        int[] arr = {3, 5, 4, 2, 6, 5};
//        int x = 3;
//        int y = 6;
//        int ans = minimumdistance(arr, x, y);
//        System.out.println("Minimum Distance between " + x + " and " + y + " is: " + ans);
//        int[] arr = {2, 5, 3, 5, 4, 2, 3};
//        int[] arr = {2, 5, 3, 5, 4, 2, 3};
//        int x = 3;
//        int y = 2;
//        int ans = mindist(arr, x, y);
//        System.out.println(ans);
    }

//    public static int mindist(int[] arr, int x, int y) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        int diff = Integer.MAX_VALUE;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                list1.add(i);
//            } else if (arr[i] == y) {
//                list2.add(i);
//            }
//        }
//        int l1 = 0;
//        int l2 = 0;
//
//        while (l1 < list1.size() && l2 < list2.size()) {
//
//            if (Math.abs(list1.get(l1) - list2.get(l2)) < diff) {
//                diff = Math.abs(list1.get(l1) - list2.get(l2));
//            }
//
//            if (list1.get(l1) < list2.get(l2)) {
//                l1++;
//            }
//            else {
//                l2++;
//            }
//        }
//        return diff;
//    }

//    public static int minimumdistance(int[] arr, int x, int y) {
//
//        int i1 = 0;
//        int i2 = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                i1 = i;
//            }
//            if (arr[i] == y) {
//                i2 = i;
//            }
//        }
//        return Math.abs(i2 - i1);
//    }

//    public static int[] multiprevnext(int[] arr) {
//
//        int[] soln = new int[arr.length];
//        int k = 0;
//        int i = 0;
//        soln[k] = arr[i] * arr[i + 1];
//        soln[soln.length - 1] = arr[arr.length - 1] * arr[arr.length - 2];
//
//        for (int j = 1; j < arr.length - 1; j++) {
//            soln[j] = arr[j - 1] * arr[j + 1];
//        }
//        return soln;
//    }

//    public static int subarraysum(int[] arr, int k) {
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j < arr.length; j++) {
//                sum = sum + arr[j];
//                if (sum == k) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

//    public static int subarrays(int[] arr, int k) {
//
//        int count = 0;
//        int s = 0;
//        int n = arr.length;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] > k) {
//                continue;
//            }
//            if (arr[i] <= k) {
//                count++;
//            }
//
//            s = (count * (count + 1)) / 2;
//        }
//        return (n * (n + 1))/2 - s;
//    }

//    public static int[] mergearray(int[] arr1, int[] arr2) {
//        int[] comb = new int[arr1.length + arr2.length];
//
//        int k = 0;
//        int i = 0;
//        int j = 0;
//        while (k < comb.length && i < arr1.length) {
//            comb[k] = arr1[i];
//            i++;
//            k++;
//        }
//        while (k < comb.length && j < arr2.length) {
//            comb[k] = arr2[j];
//            j++;
//            k++;
//        }
//        return closepair(comb, 34);
//    }
//
//    public static int[] closepair(int[] comb, int target) {
//        int l1 = 0;
//        int l2 = comb.length - 1;
//        int res_i = 0;
//        int res_j = 0;
//        int diff = 1000;
//
//        while(l1 < l2) {
//            if (Math.abs(comb[l1] + comb[l2] - target) < diff) {
//                res_i = l1;
//                res_j = l2;
//                diff = Math.abs(comb[l1] + comb[l2] - target);
//            }
//
//            if ((comb[l1] + comb[l2]) < target) {
//                l1++;
//            }
//            else {
//                l2--;
//            }
//        }
//        return new int[] {comb[res_i], comb[res_j]};
//    }

//    public static List<Integer> closestpair(int[] arr1, int[] arr2, int target, int margin) {
//        int i = arr1.length - 1;
//        int j = 0;
//
//        List<Integer> list = new ArrayList<>();
//        while (i >= 0 && j < arr2.length && (arr1[i] + arr2[j] < target)) {
//            if ((target - (arr1[i] + arr2[j])) > margin) {
//                int diff = target - (arr1[i] + arr2[j]);
//                list.add(diff);
//                j++;
//            }
//            else {
//                int diff = target - (arr1[i] + arr2[j]);
//                list.add(diff);
//                i--;
//            }
//        }
//        System.out.println(Collections.min(list));
//        return list;
//    }

//    public static int[] zigzag(int[] arr) {
//
//        boolean op = false;
//        for (int i = 0; i < arr.length - 1; i++) {
//
//            if (op) {
//                if (arr[i] < arr[i + 1]) {
//                    swapidx(arr, i, i + 1);
//                }
//            }
//            else {
//                if (arr[i] > arr[i + 1]) {
//                    swapidx(arr, i, i + 1);
//                }
//            }
////            This is flip-flop operation.
//            op = !op;
//        }
//        return arr;
//    }


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
