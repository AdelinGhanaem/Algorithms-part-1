package com.algone.dynamicon;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QuickFindTest extends DynamicConnectivityContractTest{

    QuickFind quickFind;

    @Override
    protected DynamicConnections<Integer> create(List<ConnectedPair> pairList) {
        return quickFind = new QuickFind(pairList);
    }

    @Override
    protected void init() {
    }

}