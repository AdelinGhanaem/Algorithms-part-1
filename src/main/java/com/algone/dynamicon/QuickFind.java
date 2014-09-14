package com.algone.dynamicon;

import java.io.*;
import java.util.List;


/**
 * Created by adelin.ghanayem@gmail.com
 */
public class QuickFind implements DynamicConnections<Integer> {

    private int[] numbers;

    public QuickFind(List<ConnectedPair> list) {
        numbers = new int[list.size()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (ConnectedPair pair : list) {
            connect(pair.getFirst(), pair.getSecond());
        }

    }

    @Override
    public void connect(Integer p, Integer q) {
        int pId = numbers[p];
        int qId = numbers[q];

        if (pId == qId) {//they are already connected
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == pId) {
                numbers[i] = qId;
            }
        }
    }

    @Override
    public boolean isConnected(Integer a, Integer b) {
        int pId = numbers[a];
        int qId = numbers[b];
        return pId == qId;
    }

    @Override
    public int getElementsCount() {
        return numbers.length;
    }
}
