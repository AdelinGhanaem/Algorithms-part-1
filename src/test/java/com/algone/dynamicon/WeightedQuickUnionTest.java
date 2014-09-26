package com.algone.dynamicon;

import java.util.List;

import static org.junit.Assert.*;

public class WeightedQuickUnionTest extends DynamicConnectivityContractTest{

    @Override
    protected DynamicConnections<Integer> create(List<ConnectedPair> pairList) {
        return new WeightedQuickUnion(pairList);
    }

    @Override
    protected void init() {

    }


}