package com.java.practice.p22;

import java.util.Arrays;

public class MyLinkedList<T> {

    private Node<T> head;
    private int size = 0;

    public void add(T value) {
        if (head == null) {
            this.head = new Node<T>(value);
        } else {
            Node temp = this.head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(new Node<T>(value));
        }
        size++;
    }

    public void add(int index, T value) {
        int idx = 0;
        Node<T> temp = head;

        while (temp != null) {
            if ((idx + 1) == index) {
                Node<T> nextNode = temp.getNext();
                Node<T> newNode = new Node<>(value);
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

    public T get(int index) {
        int idx = 0;
        Node<T> temp = head;

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
        Node<T> temp = head;

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
        Object[] result = new Object[size];
        int idx = 0;
        Node<T> temp = this.head;

        while (temp != null) {
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}