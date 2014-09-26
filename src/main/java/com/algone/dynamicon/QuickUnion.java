package com.algone.dynamicon;

import java.util.List;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class QuickUnion implements DynamicConnections<Integer> {

    private int[] id;
    private int size;

    public QuickUnion() {

    }

    public QuickUnion(List<ConnectedPair> list) {
        size = list.size();

        init(size);
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

    Integer findRoot(Integer a) {

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


    protected void setSize(int size) {
        this.size = size;
    }

    protected void init(int size) {
        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
        }
    }

    protected Integer getId(int position){
        return id[position];
    }

    protected Integer setId(int position,int value){
        return id[position];
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
