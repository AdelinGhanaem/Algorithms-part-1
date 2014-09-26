package com.algone.algoanaly;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public interface Sort {

    /**
     * returns a sorted version of the provided array
     * @param t
     * @param <T>
     * @return
     */
    <T> T[] sort(T[] t);
}
