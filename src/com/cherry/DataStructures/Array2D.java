package com.cherry.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
//        int[][] maze = {
//                {0, 1, 0, 0, 0},
//                {0, 0, 0, 1, 0},
//                {0, 1, 1, 0, 0},
//                {0, 1, 1, 0, 1},
//                {0, 1, 1, 0, 0}
//        };
//        ratinamaze(maze, 0, 0, "");
//        int[][] matrix = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
//        int[][] arr = matrixtranspose(matrix);
//        for (int i = 0; i < matrix.length; i++) {
//            System.out.println(Arrays.toString(matrix[i]));
//        }
//        int[] arr1 = {3, 27, 30, 40};
//        int[] arr2 = {8, 10, 80};
//        mergearrays(arr1, arr2);
//        int[] arr = {3, 5, 2, 1, 12, 20, 11, 15, 32, 45, 26, 30, 40};
//        System.out.println(Arrays.toString(mergesort(arr)));

    }


//    private static int[] mergesort(int[] array) {
//
//        if (array.length == 1) {
//            return array;
//        }
//
//        int mid = array.length / 2;
//
//        int[] left = mergesort(Arrays.copyOfRange(array, 0, mid));
//        int[] right = mergesort(Arrays.copyOfRange(array, mid, array.length));
//
//        return mergebothsides(left, right);
//    }
//
//    private static int[] mergebothsides(int[] first, int[] second) {
//        int[] mix = new int[first.length + second.length];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while (i < first.length && j < second.length) {
//            if (first[i] < second[j]) {
//                mix[k] = first[i];
//                i++;
//            }
//            else {
//                mix[k] = second[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i < first.length) {
//            mix[k] = first[i];
//            i++;
//            k++;
//        }
//
//        while (j < second.length) {
//            mix[k] = second[j];
//            j++;
//            k++;
//        }
//        return mix;
//    }

//    private static void mergearrays(int[] arr1, int[] arr2) {
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        int[] list = new int[arr1.length + arr2.length];
//
//        while (i < arr1.length && j < arr2.length) {
//            if (arr1[i] < arr2[j]) {
//                list[k] = arr1[i];
//                i++;
//            }
//            else {
//                list[k] = arr2[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < arr1.length) {
//            list[k] = arr1[i];
//            i++;
//            k++;
//        }
//        while (j < arr2.length) {
//            list[k] = arr1[j];
//            j++;
//            k++;
//        }


//        System.out.println(Arrays.toString(list));
//    }

//    public static int[][] matrixtranspose(int[][] matrix) {
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = row + 1; col < matrix.length; col++) {
//                int temp = matrix[row][col];
//                matrix[row][col] = matrix[col][row];
//                matrix[col][row] = temp;
//            }
//        }
//        return matrix;
//    }

//    public static void ratinamaze(int[][] maze, int row, int col, String path) {
//        if (row == maze.length - 1 && col == maze[0].length - 1) {
//            System.out.println(path);
//            return;
//        }
//
//        if (maze[row][col] == 1) {
//            return;
//        }
//
//        maze[row][col] = 1;
//
//        if (row < maze.length - 1) {
//            ratinamaze(maze, row + 1, col, path + "D");
//        }
//
//        if (col < maze[0].length - 1) {
//            ratinamaze(maze, row, col + 1, path + "R");
//        }
//
//        if (row > 0) {
//            ratinamaze(maze, row - 1, col, path + "U");
//        }
//
//        if (col > 0) {
//            ratinamaze(maze, row, col - 1, path + "L");
//        }
//
//        maze[row][col] = 0;
//    }
}
