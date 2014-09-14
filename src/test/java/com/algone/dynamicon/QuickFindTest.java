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

public class QuickFindTest {

    QuickFind quickFind;

    @Before
    public void setUp() throws Exception {
        quickFind = new QuickFind(new ArrayList<ConnectedPair>() {{

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
        assertThat(quickFind.getElementsCount(), is(11));
    }

    @Test
    public void returnsTrueWhenNumberAreConnected() {
        assertThat(quickFind.isConnected(4, 6), is(true));
    }

    @Test
    public void returnTrueWhenNumberAreIndirectlyConnected() {
        assertThat(quickFind.isConnected(4, 9), is(true));
    }

    @Test
    public void returnsFalseWhenNumberAreNotConnected() {
        assertThat(quickFind.isConnected(4, 3), is(false));
    }

}