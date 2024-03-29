package com.cherry.DataStructures.LinkedList;

public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete (int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

//    INSERT USING RECURSION

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, --index, node.next);
        return node;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

//    Merge
    public static CustomLinkedList merge(CustomLinkedList first, CustomLinkedList second) {
        Node f = first.head;
        Node s = second.head;

        CustomLinkedList answer = new CustomLinkedList();

        while (f != null && s != null) {
            if (f.value < s.value) {
                answer.insertLast(f.value);
                f = f.next;
            }
            else {
                answer.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            answer.insertLast(f.value);
            f = f.next;

        }
        while (s != null) {
            answer.insertLast(s.value);
            s = s.next;
        }
        return answer;
    }

//Bubble Sort in Linked List

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail){
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    second.next = first;
                    first.next = null;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        }
        else {
            bubbleSort(row - 1, 0);
        }
    }
//Recursion Linked List Reversal
    public void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverseInplace() {
        if (size < 2) {
            return;
        }
        Node prev = null;
        Node pres = head;
        Node ahead = pres.next;

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = ahead;
            if (ahead != null) {
                ahead = ahead.next;
            }
        }
        head = prev;
    }

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();
        System.out.println();
        System.out.println(list.tail.value);
        System.out.println(list.head.value);
        Node node = list.head;
        list.reverseInplace();
        list.display();
    }
//    public ListNode reverseBetween(ListNode head, int left, int right) {
//        if (left == right) {
//            return head;
//        }
////        Skip the first left n - 1 nodes.
//        ListNode current = head;
//        ListNode prev = null;
//
//        for (int i = 0; i < left - 1 && current != null; i++) {
//            prev = current;
//            current = current.next;
//        }
//
//        ListNode last = prev;
//        ListNode newEnd = current;
//        ListNode next = current.next;
//
////        Reversing the linked list.
//
//        for (int i = 0; current != null && i < right - left + 1; i++) {
//            current.next = prev;
//            prev = current;
//            current = next;
//            if (next != null) {
//                next = next.next;
//            }
//        }
//        if (last != null) {
//            last.next = prev;
//        }
//        else {
//            head = prev;
//        }
//        newEnd.next = current;
//        return head;
//    }

}
