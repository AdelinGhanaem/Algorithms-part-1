package com.algone.dynamicon;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QuickUnionTest {

    QuickUnion quickUnion;

    @Before
    public void setUp() throws Exception {
        quickUnion = new QuickUnion(new ArrayList<ConnectedPair>() {{
            add(new ConnectedPair(4, 6));
            add(new ConnectedPair(6, 5));
            add(new ConnectedPair(5, 4));
            add(new ConnectedPair(1, 4));
            add(new ConnectedPair(9, 5));

            add(new ConnectedPair(2, 1));
            add(new ConnectedPair(8, 9));
            add(new ConnectedPair(7, 2));
            add(new ConnectedPair(6, 1));
            add(new ConnectedPair(7, 6));

            add(new ConnectedPair(3, 0));

        }});
    }


    @Test
    public void shouldFetchNumbersCount() {
        assertThat(quickUnion.getElementsCount(), is(11));
    }

    @Test
    public void returnsTrueWhenNumberAreConnected() {
        assertThat(quickUnion.isConnected(4, 6), is(true));
    }

    @Test
    public void returnTrueWhenNumberAreIndirectlyConnected() {
        assertThat(quickUnion.isConnected(4, 9), is(true));
    }

    @Test
    public void returnsFalseWhenNumberAreNotConnected() {
        assertThat(quickUnion.isConnected(4, 3), is(false));
    }


}