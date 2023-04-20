package com.cherry.DataStructures.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Node {
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
//    static List<Integer> preorderTraversal(Node curr) {
//        List<Integer> preOrder = new ArrayList<>();
//        if (curr == null) {
//            return preOrder;
//        }
//        Stack<Node> stack = new Stack<>();
//        stack.push(curr);
//        while(!stack.isEmpty()) {
//            curr = stack.pop();
//            preOrder.add(curr.val);
//            if (curr.right != null) {
//                stack.push(curr.right);
//            }
//            if(curr.left != null) {
//                stack.push(curr.left);
//            }
//        }
//        return preOrder;
//    }

//    static List<Integer> inorderTraversal(Node curr) {
//        Stack<Node> stack= new Stack<>();
//        List<Integer> inOrder = new ArrayList<>();
//        while(true) {
//            if (curr != null) {
//                stack.push(curr);
//                curr = curr.left;
//            }
//            else {
//                if (stack.isEmpty()) {
//                    break;
//                }
//                curr = stack.pop();
//                inOrder.add(curr.val);
//                curr = curr.right;
//            }
//        }
//        return inOrder;
//    }

//    static List<Integer> postorderTraversal(Node curr) {
//        Stack<Node> stack1 = new Stack<>();
//        Stack<Node> stack2 = new Stack<>();
//        List<Integer> postOrder = new ArrayList<>();
//
//        if(curr == null) {
//            return postOrder;
//        }
//
//        stack1.push(curr);
//
//        while(!stack1.isEmpty()) {
//            curr = stack1.pop();
//            stack2.add(curr);
//            if (curr.left != null) {
//                stack1.push(curr.left);
//            }
//            if (curr.right != null) {
//                stack1.push(curr.right);
//            }
//        }
//        while(!stack2.isEmpty()) {
//            postOrder.add(stack2.pop().val);
//        }
//        return postOrder;
//    }

    static List<Integer> postorderOneStack(Node curr) {
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        if (curr == null) {
            return list;
        }

        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                Node temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.peek();
                    stack.pop();
                    list.add(temp.val);
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.peek();
                        stack.pop();
                        list.add(temp.val);
                    }
                } else {
                    curr = temp;
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);


        System.out.println("The Post-Order iterative Traversal is: " + postorderOneStack(root));

    }
}
