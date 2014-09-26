package com.algone.algoanaly;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void test() {
        assertTrue(binarySearch.hasElement(6, new Integer[]{0, 2, 4, 6, 8, 10}));
    }

    @Test
    public void test1() {
        assertFalse(binarySearch.hasElement(7, new Integer[]{0, 2, 4, 6, 8, 10}));
    }

    @Test
    public void test2() {
        assertFalse(binarySearch.hasElement(25, new Integer[]{0, 2, 4, 6, 8, 10}));
    }

    @Test
    public void test3() {
        assertTrue(binarySearch.hasElement(100, new Integer[]{0, 2, 4, 6, 8, 10,100}));
    }

    @Test
    public void test4() {
        assertFalse(binarySearch.hasElement(-5, new Integer[]{0, 2, 4, 6, 8, 10}));
    }

    @Test
    public void test5() {
        System.out.println((int)1.9);
    }

}