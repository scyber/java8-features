package algorithms;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Percolation {
    public Percolation(int n) {
        // create n-by-n grid, with all sites blocked
    }
    public void open(int row, int col){
        // open site (row, col) if it is not open already
    }
    public boolean isOpen(int row, int col){
        // is site (row, col) open?

        return true;}
    public boolean isFull(int row, int col) {
        // is site (row, col) full?

        return  true;
    }
    public int numberOfOpenSites(){
        // number of open sites

        return 0;
    }
    public boolean percolates() {
        // does the system percolate?

        return true;
    }
    public static int getRandomInt(int min, int max){

        int res = (int) Math.round(Math.random() * (max - min));
        //System.out.println(Math.random() * max);
        res = new Random().nextInt(20);
        return res;
    }

    public static void main(String args[]){
        int size = 20;
        boolean percs [][] = new boolean[20][20];

        percs[0][0] = true;
        percs[0][1] = true;
        percs[0][3] = true;

        System.out.println(percs[0][0]);
        System.out.println(percs[0][2]);
        for (int i = 1; i<= 20; i++) {
            System.out.print(" ");
            System.out.print(getRandomInt(0, 20));
        }

    }
}
