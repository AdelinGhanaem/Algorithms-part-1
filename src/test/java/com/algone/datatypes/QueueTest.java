package com.algone.datatypes;

import org.junit.Before;

import java.util.Queue;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public abstract class QueueTest<T> {


    abstract Queue<T> create();

    private Queue<T> queue;


    void init() {

    }

    @Before
    public void setUp() throws Exception {

        init();

        queue = create();

    }





}
