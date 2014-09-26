package com.algone.sortalgorithms;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class SelectSort<T extends Comparable<T>> implements ElementsSort<T> {


    @Override
    public void sort(T[] comparables) {
        for (int i = 0; i < comparables.length; i++) {
            for (int j = i + 1; j < comparables.length; j++) {
                if (comparables[i].compareTo(comparables[j]) > 0) {
                    swat(comparables, i, j);
                }

            }

        }


    }


    private void swat(T[] elements, int i, int j) {

        T temp = elements[i];

        elements[i] = elements[j];

        elements[j] = temp;
    }
}
