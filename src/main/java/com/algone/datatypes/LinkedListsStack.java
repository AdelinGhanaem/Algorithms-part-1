package com.algone.datatypes;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class LinkedListsStack<T> implements Stack<T> {


    private Node<T> firstElement = null;
    private int size;


    @Override
    public void push(T item) {
        firstElement = new Node<T>(firstElement, item);
        size++;
    }

    @Override
    public T pop() {
        if (firstElement == null) {
            return null;
        }
        T value = firstElement.value;
        firstElement = firstElement.getNext();
        return value;
    }


    @Override
    public boolean isEmpty() {
        return firstElement == null;
    }

    @Override
    public int size() {
        return size;
    }


    private static class Node<T> {


        private Node<T> next;

        T value;

        public Node(Node<T> next, T value) {
            this.next = next;
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public T getValue() {
            return value;
        }

        public boolean hasNext() {
            return next != null;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public boolean hasValue() {
            return value != null;
        }
    }
}
