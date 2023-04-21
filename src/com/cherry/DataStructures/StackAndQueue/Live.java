package com.cherry.DataStructures.StackAndQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Live {
    public static void main(String[] args) {
//        String str = ")))())))()((((())";
//        char[] arr = str.toCharArray();
//        int ans = countParanthesis(arr);
//        System.out.println(ans);
//        int[] arr = {8, 7, 3, 1, 2, 4, 9, 4, 6};
//        nextGreater(arr);
    }

//    private static void nextGreater(int[] arr) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(arr[0]);
//
//        for (int i = 1; i < arr.length; i++) {
//            if (stack.isEmpty()) {
//                stack.push(arr[i]);
//                continue;
//            }
//            while (!stack.isEmpty() && stack.peek() < arr[i]) {
//                stack.pop();
//                System.out.println(arr[i]);
//            }
//            stack.push(arr[i]);
//        }
//        while(!stack.isEmpty()) {
//            System.out.println(-1);
//            stack.pop();
//        }
//    }


//Brute-Force Approach for the Next Greater Element inside the array.
//    TC --> O(N^2)
//    SC --> O(N)
//    private static int[] nextGreater(int[] arr) {
//        int[] list = new int[arr.length];
//        list[arr.length -1] = -1;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] > arr[i]) {
//                    list[i] = arr[j];
//                    break;
//                }
//                else {
//                    list[i] = -1;
//                }
//            }
//        }
//        return list;
//    }
    

//    private static int countParanthesis(char[] arr) {
//        Stack<Character> stack = new Stack<>();
//        int count= 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == '(') {
//                stack.push(arr[i]);
//            } else if (arr[i] == ')') {
//                if (stack.isEmpty()) {
//                }
//                else {
//                    stack.pop();
//                    count = count + 2;
//                }
//            }
//        }
//        return count;
//    }


//    private static boolean validParanthesis(char[] arr) {
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
//                stack.push(arr[i]);
//            } else if (arr[i] == ')') {
//                if (stack.isEmpty() || stack.pop() != '(') {
//                    return false;
//                }
//
//            } else if (arr[i] == '}') {
//                if (stack.isEmpty() || stack.pop() != '{') {
//                    return false;
//                }
//
//            } else if (arr[i] == ']') {
//                if (stack.isEmpty() || stack.pop() != '[') {
//                    return false;
//                }
//
//            }
//        }
//        return true;
//    }
}
