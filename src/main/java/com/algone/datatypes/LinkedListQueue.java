package com.algone.datatypes;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class LinkedListQueue<T> implements Stack<T> {


    private Node<T> first;

    private Node<T> last;

    private int size;

    @Override
    public void push(T item) {
        if (first == null) {
            first = new Node<T>(null, item);
            last = first;
        } else {
            last = setToNext(first, item);
        }
        size++;
    }


    @Override
    public T pop() {

        T value = first.value;

        first = first.next;

        size--;

        return value;
    }

    @Override
    public boolean isEmpty() {
        return first!=null;
    }

    @Override
    public int size() {
        return size;
    }


    private Node<T> setToNext(Node<T> node, T item) {
        if (node.next != null) {
            setToNext(node.next, item);
        }
        Node<T> nextNode = new Node<T>(null, item);
        node.next = nextNode;
        return nextNode;
    }

    private static class Node<T> {

        Node<T> next;

        T value;

        public Node(Node<T> next, T value) {
            this.next = next;
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

    }
}
