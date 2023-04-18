package com.cherry.DataStructures.StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class InterviewProblems {
    public static void main(String[] args) {
//        QueueUsingStack stack = new QueueUsingStack();
//        stack.push(5);
//        System.out.println(stack.pop());
//        stack.add(34);
//        stack.add(21);
//        stack.add(11);
//        stack.add(9);
//        System.out.println(stack.remove());
//        System.out.println(stack.remove());
//        System.out.println(stack.remove());
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());
//        int[] arr1 = {4, 2, 4, 6, 1};
//        int[] arr2 = {2, 1, 8, 5};
//        int ans = twoStack(10, arr1, arr2, 0, 0);
//        System.out.println(ans - 1);
//        int[] heights = {2, 1, 5, 6, 2, 3};
//        int ans = largestAreaHist(heights);
//        System.out.println(ans);
//        Stack<Integer> stack = new Stack<>();
//        stack.push(3);
//        stack.push(2);
//        stack.push(1);
//        revStack(stack);
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.peek());
//            stack.pop();
//        }
//    }
//
//    private static void revStack(Stack<Integer> stack) {
//        if (stack.isEmpty()) {
//            return;
//        }
//        int top = stack.pop();
//        revStack(stack);
//        pushAtBottom(stack, top);
//    }
//
//    private static void pushAtBottom(Stack<Integer> stack, int data) {
//        if (stack.isEmpty()) {
//            stack.push(data);
//            return;
//        }
//        int top = stack.pop();
//        pushAtBottom(stack, data);
//        stack.push(top);
//        String braces = "{({[]})}";
//        char[] arr = braces.toCharArray();
//        boolean ans = validParenthesis(arr);
//        System.out.println(ans);
        String check = "abbaca";
        char[] arr = check.toCharArray();
        String ans = adjDuplicates(arr);
        System.out.println(ans);

    }

    private static String adjDuplicates(char[] arr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
            }
            else {
                stack.push(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

//    private static boolean validParenthesis(char[] arr) {
//        Stack<Character> stack = new Stack<>();
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
//            } else if (arr[i] == ']') {
//                if (stack.isEmpty() || stack.pop() != '[') {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }


//INSERT EFFICIENT
//class QueueUsingStack {
//    private Stack<Integer> first;
//    private Stack<Integer> second;
//    public QueueUsingStack() {
//        first = new Stack<>();
//        second = new Stack<>();
//    }
//
//    public void add(int item) {
//        first.push(item);
//    }
//    public int remove() {
//        while (!first.isEmpty()) {
//            second.push(first.pop());
//        }
//        int removed = second.pop();
//
//        while (!second.isEmpty()) {
//            first.push(second.pop());
//        }
//        return removed;
//    }
//
//    public int peek() {
//        while (!first.isEmpty()) {
//            second.push(first.pop());
//        }
//        int peeked = second.peek();
//
//        while (!second.isEmpty()) {
//            first.push(second.pop());
//        }
//        return peeked;
//    }
//    public boolean isEmpty() {
//        return first.isEmpty();
//    }
//}

//REMOVE EFFICIENT

//class QueueUsingStack {
//    private Stack<Integer> first;
//    private Stack<Integer> second;
//
//    public QueueUsingStack() {
//        first = new Stack<>();
//        second = new Stack<>();
//    }
//
//    public int remove() {
//        return first.pop();
//    }
//
//    public void add(int item) {
//        while(!first.isEmpty()) {
//            second.push(first.pop());
//        }
//        first.push(item);
//
//        while(!second.isEmpty()) {
//            first.push(second.pop());
//        }
//    }
//
//    public int peek() {
//        return first.peek();
//    }
//
//    public boolean isEmpty() {
//        return first.isEmpty();
//    }
//
//}

//    public static int twoStack(int target, int[] a, int[] b, int sum, int count) {
//        if (sum > target) {
//            return count;
//        }
//        if (a.length == 0 || b.length == 0) {
//            return count;
//        }
//        int ans1 = twoStack(target, Arrays.copyOfRange(a,1,a.length), b, sum + a[0], count + 1);
//        int ans2 = twoStack(target, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);
//
//        return Math.max(ans1, ans2);
//    }

//    public static int largestAreaHist(int[] arr) {
//        Stack<Integer> stack = new Stack<>();
//        int max = 0;
//
//        stack.push(0);
//
//
//        for (int i = 1; i < arr.length; i++) {
//            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
//                max = getMax(arr, stack, max, i);
//            }
//            stack.push(i);
//        }
//        int i = arr.length;
//        while(!stack.isEmpty()) {
//            max = getMax(arr, stack, max, i);
//        }
//        return max;
//    }
//    public static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
//        int area;
//        int popped = stack.pop();
//        if (stack.isEmpty()) {
//            area = arr[popped] * i;
//        }
//        else {
//            area = arr[popped] * (i - 1 - stack.peek());
//        }
//        return Math.max(max, area);
//    }
}