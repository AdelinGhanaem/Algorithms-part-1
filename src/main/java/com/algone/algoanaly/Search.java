package com.algone.algoanaly;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public interface Search {


    /**
     * given a sorted array returns true if privuded elements exists in the array false otherwise
     * @param element
     * @param sortedArray
     * @param <T>
     * @return
     */
   <T extends Comparable<T>> boolean hasElement(T element,T[] sortedArray);

    /**
     * Sorts and returns true if provided elements is in the array
     * @param element
     * @param sortedArray
     * @param sort
     * @param <T>
     * @return
     */
    <T> boolean sortAndFind(T element,T[] sortedArray,Sort sort);

}
