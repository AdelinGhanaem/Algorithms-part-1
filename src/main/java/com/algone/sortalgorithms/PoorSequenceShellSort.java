package com.algone.sortalgorithms;

import com.algone.algoanaly.Sort;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class PoorSequenceShellSort implements ElementsSort {

    @Override
    public void sort(Comparable[] comparables) {

        int j;

        int gap = comparables.length / 2;

        while (gap > 0) {
            System.out.println("gap =" + gap);

            for (int i = gap; i < comparables.length; i++) {
                Comparable temp = comparables[i];

                System.out.println("i =" + i);

                System.out.println("comparables[" + i + "] =" + comparables[i]);

                j = i;

                while (j >= gap && temp.compareTo(comparables[j - gap]) < 0) {
                    System.out.println("j before=" + j);
                    comparables[j] = comparables[j - gap];
                    System.out.println("comparables[" + j + "] =" + comparables[j]);
                    j -= gap;
                    System.out.println("j after=" + j);


                }
                comparables[j] = temp;
            }
            gap /= 2;
        }
    }
}
