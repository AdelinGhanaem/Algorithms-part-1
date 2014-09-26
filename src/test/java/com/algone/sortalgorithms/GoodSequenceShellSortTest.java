package com.algone.sortalgorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoodSequenceShellSortTest {

    GoodSequenceShellSort sort = new GoodSequenceShellSort();

    @Test
    public void sortArrays() throws Exception {
        Integer[] array = new Integer[]{81, 94, 11, 96, 12, 35, 17, 95, 28, 58, 41, 75, 15};
        sort.sort(array);
    }
}