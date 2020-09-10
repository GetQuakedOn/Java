package com.java.practice.p22;

import java.util.Arrays;

public class MyLinkedList {

    private Node head;
    private int size = 0;

    public void add(int value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = this.head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(new Node(value));
        }
        size++;
    }

    public void add(int index, int value) {
        int idx = 0;
        Node temp = head;

        while (temp != null) {
            if ((idx + 1) == index) {
                Node nextNode = temp.getNext();
                Node newNode = new Node(value);
                temp.setNext(newNode);
                newNode.setNext(nextNode);
                size++;
                return;
            } else {
                temp = temp.getNext();
                idx++;
            }
        }
    }

    public int get(int index) {
        int idx = 0;
        Node temp = head;

        while (temp != null) {
            if (idx == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                idx++;
            }
        }
        throw new NegativeArraySizeException();
    }

    public void remove(int index) {
        int idx = 0;
        Node temp = head;

        while (temp != null) {
            if ((idx + 1) == index) {
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                idx++;
            }
        }
    }

    @Override
    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        Node temp = this.head;

        while (temp != null) {
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}