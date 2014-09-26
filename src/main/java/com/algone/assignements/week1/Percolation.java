package com.algone.assignements.week1;

import com.algone.dynamicon.QuickFind;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class Percolation {

    private int[] grid;
    private int gridSize;
    private static final int BLOCKED = 0;
    private static final int EMPTY = 1;
    private static final int FULL = 2;

    /**
     * create N-by-N grid, with all sites blocked
     *
     * @param N
     */
    public Percolation(int N) {
        gridSize=N;
        grid = new int[N * N];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                grid[i * j] = BLOCKED;
            }
        }
    }

    // open site (row i, column j) if it is not already
    public void open(int i, int j) {
        check(i,j);
        grid[i * j] = EMPTY;

    }

    // is site (row i, column j) open?
    public boolean isOpen(int i, int j) {
        check(i,j);
        return grid[i * j] == EMPTY;
    }

    // is site (row i, column j) full?
    public boolean isFull(int i, int j) {
        check(i,j);
        return grid[i * j] == FULL;

    }

    // does the system percolate?
    public boolean percolates() {
        return false;
    }

    private void check(int i,int j){
        if(i<1|| i<1 || i>gridSize|| j>gridSize){
            throw new IllegalArgumentException();
        }
    }

    // test client, optional
    public static void main(String[] args) {

        Percolation percolation = new Percolation(20);



    }

}
