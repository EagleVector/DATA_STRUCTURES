package com.cherry.DataStructures.StackAndQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public TreeNode() {

    }
}

class Traversal {
//    static void preorderTraversal(Node curr, ArrayList<Integer> preOrder) {
//        if (curr == null) {
//            return;
//        }
//        preOrder.add(curr.data);
//        preorderTraversal(curr.left, preOrder);
//        preorderTraversal(curr.right, preOrder);
//    }

//    static void inorderTraversal(Node curr, ArrayList<Integer> inOrder) {
//        if (curr == null) {
//            return;
//        }
//        inorderTraversal(curr.left, inOrder);
//        inOrder.add(curr.data);
//        inorderTraversal(curr.right, inOrder);
//    }

//    static void postorderTraversal(Node curr, ArrayList<Integer> postOrder) {
//        if (curr == null) {
//            return;
//        }
//        postorderTraversal(curr.left, postOrder);
//        postorderTraversal(curr.right, postOrder);
//        postOrder.add(curr.data);
//    }
    static List<Integer> levelOrderTraversal(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            list.add(curr.data);

            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);


        System.out.println("The Level-Order Traversal is: " + levelOrderTraversal(root));
    }
}
