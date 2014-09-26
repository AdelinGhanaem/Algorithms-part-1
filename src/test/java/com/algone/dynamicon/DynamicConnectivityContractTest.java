package com.algone.dynamicon;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public abstract class DynamicConnectivityContractTest {


    protected abstract DynamicConnections<Integer> create(List<ConnectedPair> pairList);

    private DynamicConnections<Integer> connections;

    protected abstract void init();

    @Before
    public void setUp() throws Exception {
        init();
        connections = create(new ArrayList<ConnectedPair>() {{
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
            }
        });
    }


    @Test
    public void shouldFetchNumbersCount() {
        assertThat(connections.getElementsCount(), is(11));
    }

    @Test
    public void returnsTrueWhenNumberAreConnected() {
        assertThat(connections.isConnected(4, 6), is(true));
    }

    @Test
    public void returnTrueWhenNumberAreIndirectlyConnected() {
        assertThat(connections.isConnected(4, 9), is(true));
    }

    @Test
    public void returnsFalseWhenNumberAreNotConnected() {
        assertThat(connections.isConnected(4, 3), is(false));
    }
}
