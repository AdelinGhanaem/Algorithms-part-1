package com.algone.dynamicon;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public interface DynamicConnections<T> {


    /**
     * Connects two elements;
     * @param a
     * @param b
     */
    void connect(T a, T b);

    /**
     * Returns true if the tow elements are connected
     * @param a
     * @param b
     * @return
     */
    boolean isConnected(T a,T b);

    /**
     * Returns elements count
     * @return
     */
   int getElementsCount();

}


