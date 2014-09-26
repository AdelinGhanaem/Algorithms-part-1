package com.algone.utils;

import java.io.PrintStream;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class MillisecondsStopWatch implements StopWatch{



    private PrintStream stream;


    public MillisecondsStopWatch(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void timeAndPrint(Action action) {

        long start = System.currentTimeMillis();

        action.doAction();

        long end = System.currentTimeMillis();

        stream.println((double) end - start);
    }


}
