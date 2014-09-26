package com.algone.sortalgorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class PoorSequenceShellSortTest {




    private PoorSequenceShellSort sort = new PoorSequenceShellSort();
    @Test
    public void shouldSortElement() throws Exception {

        Integer[] array = new Integer[]{81, 94, 11, 96, 12, 35, 17, 95, 28, 58, 41, 75, 15};

        sort.sort(array);

        for(int i:array){
            System.out.println(i);
        }



    }
}