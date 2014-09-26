package com.algone.sortalgorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public abstract class SortTest<T extends Comparable<T>> {

    abstract ElementsSort<T> create();

    abstract T[] array();

        ElementsSort<T> sort;

    void init() {

    }

    @Before
    public void setUp() throws Exception {
        init();
        sort = create();
    }


}