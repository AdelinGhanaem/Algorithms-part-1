package com.algone.datatypes;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public abstract class StackTest<T> {


    Stack<T> stack;

    abstract Stack<T> create();

    abstract T randomItem();


    abstract void init();

    @Before
    public void setUp() throws Exception {
        stack = create();
        init();
    }

    @Test
    public void popsWhatWasSaved() {

        T item = randomItem();
        stack.push(item);
        assertTrue(item.equals(stack.pop()));

    }


    @Test
    public void firstInFirstOut() {
        T firstItem = randomItem();
        T secondItem = randomItem();

        stack.push(firstItem);
        stack.push(secondItem);

        T s = stack.pop();
        T q = stack.pop();

        assertTrue(secondItem.equals(s));
        assertTrue(firstItem.equals(q));

    }


    @Test
    public void shouldReturnsStacksSize() {
        int expectedSize = 10;
        for (int i = 0; i < expectedSize; i++) {
            stack.push(randomItem());
        }
        assertThat(stack.size(), is(expectedSize));
    }


    @Test
    public void returnsTrueWhenStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }


    @Test
    public void returnsFalseWhenStackIsNotEmpty() {
        stack.push(randomItem());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void nullIsReturnedWhenStackIsEmpty() throws Exception {
        assertNull(stack.pop());
    }
}