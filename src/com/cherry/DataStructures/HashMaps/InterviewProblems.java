package com.cherry.DataStructures.HashMaps;

import com.cherry.DataStructures.Trees.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class InterviewProblems {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
//        frequencyEle(arr);
//        int[] arr1 = {7, 3, 9};
//        int[] arr2 = {6, 3, 9, 2, 9, 4};
//        arrUnion(arr1, arr2);
//        int[] arr1 = {7, 3, 9};
//        int[] arr2 = {6, 3, 9, 2, 9, 4};
//        int ans = arrIntersection(arr1, arr2);
//        System.out.println(ans);
//        String s = "car";
//        String t = "rat";
//        boolean ans = isAnagram(s, t);
//        System.out.println(ans);
//        HashMap<String, String> map = new HashMap<>();
//        map.put("Chennai", "Bengaluru");
//        map.put("Mumbai", "Delhi");
//        map.put("Goa", "Chennai");
//        map.put("Delhi", "Goa");
//
//        String start = getStart(map);
//
//        while(map.containsKey(start)) {
//            System.out.print(start + " ---> ");
//            start = map.get(start);
//        }
//        System.out.print(start);
//        int[] arr = {1, 1, 1, 2, 2, 3};
//        int k = 2;
//        int[] res = topFrequency(arr, k);
//        System.out.println(Arrays.toString(res));
//        int[] arr = {1, 2, 3, 4};
//        productArray(arr);
//        String[][] board = {{"5","3",".",".","7",".",".",".","."},
//                {"6",".",".","1","9","5",".",".","."},
//                {".","9","8",".",".",".",".","6","."},
//                {"8",".",".",".","6",".",".",".","3"},
//                {"4",".",".","8",".","3",".",".","1"},
//                {"7",".",".",".","2",".",".",".","6"},
//                {".","6",".",".",".",".","2","8","."},
//                {".",".",".","4","1","9",".",".","5"},
//                {".",".",".",".","8",".",".","7","9"}};
//
//        boolean ans = validSudoku(board);
//        System.out.println(ans);
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        int ans = longestSub(arr);
        System.out.println(ans);
    }

    private static int longestSub(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int count = 1;
        if (arr.length == 0) {
            return 0;
        }
        for (int num : arr) {
            set.add(num);
        }
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int maxCount = 1;
                while (set.contains(num + 1)) {
                    num++;
                    maxCount++;
                }
                count = Math.max(count, maxCount);
            }
        }
        return count;
    }

//    private static int longestSub(int[] arr) {
//        int count = 1;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length - 1; i++){
//            if (arr[i + 1] == arr[i] + 1) {
//                count++;
//            }
//        }
//        return count;
//    }

//    private static boolean validSudoku(String[][] board) {
//        int row = board.length;
//        int col = board[0].length;
//
//        // Check for rows.
//        for (int i = 0; i < row; i++) {
//            HashSet<String> rowSet = new HashSet<>();
//            for (int j = 0; j < col; j++) {
//                if (board[i][j] == ".") {
//                    continue;
//                }
//                if (rowSet.contains(board[i][j])) {
//                    return false;
//                }
//                rowSet.add(board[i][j]);
//            }
//        }
//
//        // Check for columns.
//        for (int i = 0; i < col; i++) {
//            HashSet<String> colSet = new HashSet<>();
//            for (int j = 0; j < row; j++) {
//                if (board[j][i] == ".") {
//                    continue;
//                }
//                if (colSet.contains(board[j][i])) {
//                    return false;
//                }
//                colSet.add(board[j][i]);
//            }
//        }
//
////      Check for blocks.
//        for (int i = 0; i < row; i = i + 3) {
//            for (int j = 0; j < col; j = j + 3)  {
//                if (!validBlock(i, j, board)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    private static boolean validBlock(int rowIdx, int colIdx, String[][] board) {
//        int row = rowIdx + 3;
//        int col = colIdx + 3;
//
//        HashSet<String> blockSet = new HashSet<>();
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (board[i][j] == ".") {
//                    continue;
//                }
//                if (blockSet.contains(board[i][j])) {
//                    return false;
//                }
//                blockSet.add(board[i][j]);
//            }
//        }
//        return true;
//    }

//    private static void productArray(int[] arr) {
//        int[] prefixArr = new int[arr.length];
//        int[] postfixArr = new int[arr.length];
//        int[] result = new int[arr.length];
//        prefixArr[0] = arr[0];
//        postfixArr[arr.length - 1] = arr[arr.length - 1];
//
//        for (int i = 1; i < arr.length; i++) {
//            prefixArr[i] = arr[i] * prefixArr[i - 1];
//        }
//        for (int i = arr.length - 2; i >= 0; i--) {
//            postfixArr[i] = arr[i] * postfixArr[i + 1];
//        }
//        result[0] = postfixArr[1];
//        result[arr.length - 1] = prefixArr[arr.length - 2];
//        for (int i = 1; i < arr.length - 1; i++) {
//            result[i] = prefixArr[i - 1] * postfixArr[i + 1];
//        }
//
//        System.out.println(Arrays.toString(prefixArr));
//        System.out.println(Arrays.toString(postfixArr));
//        System.out.println(Arrays.toString(result));
//    }
}

//    private static int[] topFrequency(int[] arr, int k) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int[] ans = new int[k];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            }
//            else {
//                map.put(arr[i], 1);
//            }
//        }
//        while (k > 0) {
//            int maxCount = Integer.MIN_VALUE;
//            int maxNum = -1;
//            for (int key : map.keySet()) {
//                int count = map.get(key);
//                if (count > maxCount) {
//                    maxCount = count;
//                    maxNum = key;
//                }
//            }
//            ans[k - 1] = maxNum;
//            map.remove(maxNum);
//            k--;
//        }
//        return ans;
//    }
//}

//    private static String getStart(HashMap<String, String> map) {
//        HashMap<String, String> revMap = new HashMap<>();
//        for (String key : map.keySet()) {
//            revMap.put(map.get(key), key);
//        }
//
//        for (String key : map.keySet()) {
//            if (!revMap.containsKey(key)) {
//                return key;
//            }
//        }
//        return null;
//    }

//    private static boolean isAnagram(String s, String t) {
//        char[] arr1 = s.toCharArray();
//        char[] arr2 = t.toCharArray();
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//
//        for (int i = 0; i < arr1.length; i++) {
//            if (map1.containsKey(arr1[i])) {
//                map1.put(arr1[i], map1.get(arr1[i]) + 1);
//            }
//            else {
//                map1.put(arr1[i], 1);
//            }
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            if (map2.containsKey(arr2[i])) {
//                map2.put(arr2[i], map2.get(arr1[i]) + 1);
//            }
//            else {
//                map2.put(arr2[i], 1);
//            }
//        }
//        if (map1.equals(map2)) {
//            return true;
//        }
//        return false;
//    }

//    private static int arrIntersection(int[] arr1, int[] arr2) {
//        HashSet<Integer> set = new HashSet<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int count = 0;
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr1.length; i++) {
//            set.add(arr1[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            if (set.contains(arr2[i])) {
//                count++;
//                list.add(arr2[i]);
//                set.remove(arr2[i]);
//            }
//        }
//        System.out.println(list);
//        return count;
//    }


//    private static void arrUnion(int[] arr1, int[] arr2) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr1.length; i++) {
//            set.add(arr1[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            set.add(arr2[i]);
//        }
//        System.out.println(set.size());
//        System.out.println(set);

//    private static void arrUnion(int[] arr1, int[] arr2) {
//        int m = arr1.length;
//        int n = arr2.length;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        int[] result = new int[m + n];
//        int i;
//        for (i = 0; i < m; i++) {
//            result[i] = arr1[i];
//        }
//        for (int j = 0; j < n; j++) {
//            result[i + j] = arr2[j];
//        }
//        System.out.println(Arrays.toString(result));
//
//        for (int k = 0; k < result.length; k++) {
//            if (map.containsKey(result[k])) {
//                map.put(result[k], map.get(result[k]) + 1);
//            }
//            else {
//                map.put(result[k], 1);
//            }
//        }
//        System.out.println(map);
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int key : map.keySet()) {
//            list.add(key);
//        }
//        System.out.println(list);
//    }

//    private static void frequencyEle(int[] arr) {
//        int n = arr.length;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            }
//            else {
//                map.put(arr[i], 1);
//            }
//        }
//        for (int key : map.keySet()) {
//            if (map.get(key) > n / 3) {
//                System.out.println(key);
//            }
//        }
//    }

//    private static void frequencyEle(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            System.out.println(arr[i] + " : " + count);
//        }
//    }
