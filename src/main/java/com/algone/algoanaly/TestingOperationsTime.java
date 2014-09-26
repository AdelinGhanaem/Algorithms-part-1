package com.algone.algoanaly;

import com.algone.utils.Action;
import com.algone.utils.NanosecondsStopWatch;
import com.algone.utils.StopWatch;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class TestingOperationsTime {


    public static void main(String[] strings) {

        StopWatch watch = new NanosecondsStopWatch(System.out);


        watch.timeAndPrint(new Action() {
            @Override
            public void doAction() {
                int i= 2-2;
            }
        });

        watch.timeAndPrint(new Action() {
            @Override
            public void doAction() {
                int i= 2*2;
            }
        });

        watch.timeAndPrint(new Action() {
            @Override
            public void doAction() {
                int i= 2/2;
            }
        });




        watch.timeAndPrint(new Action() {
            @Override
            public void doAction() {
                int i= 2+2;
            }
        });


    }
}
