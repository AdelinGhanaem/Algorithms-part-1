package com.algone.dynamicon;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QuickUnionTest extends DynamicConnectivityContractTest{

    QuickUnion quickUnion;

    @Override
    protected DynamicConnections<Integer> create(List<ConnectedPair> pairList) {
        return new QuickUnion(pairList);
    }

    @Override
    protected void init() {
    }

}