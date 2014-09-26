package com.algone.dynamicon;

import java.util.List;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class WeightedQuickUnion extends QuickUnion {

    private int sizes[];

    public WeightedQuickUnion(List<ConnectedPair> connectedPairs) {
        init(connectedPairs.size());
        sizes= new int[connectedPairs.size()];
        setSize(connectedPairs.size());

        for (ConnectedPair pair : connectedPairs) {
            connect(pair.getFirst(), pair.getSecond());
        }
    }



    @Override
    public void connect(Integer a, Integer b) {

        int rootA = findRoot(a);
        int rootB = findRoot(b);

        if(rootA==rootB){
            return;
        }

        if (sizes[rootA] == sizes[rootB] || sizes[rootA] < sizes[rootB]) {
            setId(rootA,rootB);
            if(sizes[rootA]==0){
                sizes[rootA]=1;
            }


            sizes[rootB] += sizes[rootA];
        }else{
            setId(rootB,rootA);
            if(sizes[rootB]==0){
                sizes[rootB]=1;
            }
            sizes[rootA] += sizes[rootB];
        }
    }
}
