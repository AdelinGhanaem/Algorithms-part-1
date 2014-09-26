package com.algone.sortalgorithms;

import org.junit.Test;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class SelectSortTest extends SortTest<Integer> {

    @Override
    ElementsSort<Integer> create() {
        return new SelectSort<Integer>();
    }

    @Override
    Integer[] array() {
        return null;
    }

    @Test
    public void shouldSortProvidedArray() throws Exception {

        Integer[] array = new Integer[]{81, 94, 11, 96, 12, 35, 17, 95, 28, 58, 41, 75, 15};

        sort.sort(array);

        for (int i : array) {
            System.out.println(i);
        }

    }


    @Test
    public void shouldSortProvidedArray2() throws Exception {


        Integer[] array = new Integer[]{4, 2, 4, 1, 3, 45, 23, 424, 3};


        sort.sort(array);


        for (int i : array) {
            System.out.println(i);
        }

    }
}
