package com.cherry.DataStructures;

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
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int[][] arr = matrixtranspose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static int[][] matrixtranspose(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row + 1; col < matrix.length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        return matrix;
    }

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
