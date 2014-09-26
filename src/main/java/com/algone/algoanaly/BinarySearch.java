package com.algone.algoanaly;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class BinarySearch implements Search {


    @Override
    public <T extends Comparable<T>> boolean hasElement(T element, T[] sortedArray) {
        int high = sortedArray.length - 1;
        int low = 0;
        int pivot;

        while (low <= high) {
            pivot = low + (high - low) / 2;

            System.out.println(pivot);

            if (sortedArray[pivot].compareTo(element) > 0) { //go right
                high = pivot - 1;

            } else {
                System.out.println(pivot);
                if (sortedArray[pivot].compareTo(element) < 0) {  //go right
                    low = pivot + 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public <T> boolean sortAndFind(T element, T[] sortedArray, Sort sort) {
        return false;
    }
}
