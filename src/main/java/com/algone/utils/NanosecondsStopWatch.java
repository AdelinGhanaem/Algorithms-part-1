package com.algone.utils;

import java.io.PrintStream;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class NanosecondsStopWatch implements StopWatch {

    private PrintStream stream;

    public NanosecondsStopWatch(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void timeAndPrint(Action action) {

        long start = System.nanoTime();

        action.doAction();

        long end = System.nanoTime();

        stream.println(end-start);
    }

}
