package com.algone.datatypes;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public interface Stack<T> {



    void push(T item);

    T pop();

    boolean isEmpty();

    int size();

}
