package com.algone.dynamicon;

import java.util.List;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class QuickUnion implements DynamicConnections<Integer> {

    private int[] id;
    private int size;

    public QuickUnion(List<ConnectedPair> list) {
        size = list.size();
        id = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            id[i] = i;
        }
        for (ConnectedPair pair : list) {
            connect(pair.getFirst(), pair.getSecond());
        }
    }


    @Override
    public void connect(Integer a, Integer b) {
        //to connect tow number, merge two components, set the Ids of a's root to the Id of q's root;
        Integer rootA = findRoot(a);

        Integer rootB = findRoot(b);

        id[rootA] = rootB;
    }

    private Integer findRoot(Integer a) {

        // to find the root of an element we traverse the tree starting from the button

        while (a != id[a]) {
            a = id[a];
        }
        return a;

        // this is another approach using recursion however it is good to avoid recursion.
//        if (id[a] == a) {  // the recursion end when a is the root which is when a's parent is a
//            return a;
//        } else {
//            return findRoot(id[a]);
//        }
    }


    @Override
    public boolean isConnected(Integer a, Integer b) {
        return findRoot(a).equals(findRoot(b));
    }

    @Override
    public int getElementsCount() {
        return size;
    }
}
