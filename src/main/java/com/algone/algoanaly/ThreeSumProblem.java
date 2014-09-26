package com.algone.algoanaly;

import com.algone.utils.Action;
import com.algone.utils.MillisecondsStopWatch;

import java.util.Random;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class ThreeSumProblem {


    private static final Random RANDOM = new Random();

    public static void main(String[] args) {


        MillisecondsStopWatch watch = new MillisecondsStopWatch(System.out);


        watch.timeAndPrint(new Action() {
            @Override
            public void doAction() {

                count(generate(10));

            }
        });

        watch.timeAndPrint(new Action() {
            @Override
            public void doAction() {
                count(generate(1000));
            }
        });

        watch.timeAndPrint(new Action() {
            @Override
            public void doAction() {
                count(generate(2000));
            }
        });

        watch.timeAndPrint(new Action() {
            @Override
            public void doAction() {
                count(generate(4000));
            }
        });

    }


    private static int[] generate(int size) {

        int[] ints = new int[size];

        for (int i = 0; i < size; i++) {

            ints[i] = RANDOM.nextInt();

        }

        return ints;
    }


    private static int count(int[] array) { // this is a brute force approach ...
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
