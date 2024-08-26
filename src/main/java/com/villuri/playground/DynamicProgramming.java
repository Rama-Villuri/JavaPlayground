package com.villuri.playground;

public class DynamicProgramming {


    public static int findMaxKnapsackProfit(int capacity , int [] weights, int [] values) {
        int n = weights.length;
        return findKnapSackProfitHelper(capacity, weights, values, n);
    }

    public static int findKnapSackProfitHelper(int capacity, int[] weights,int [] values , int n){

        if (n == 0 || capacity ==0) {
            return  0;
        }

        if ( weights[n-1] <= capacity) {

            return  Math.max(
                        values[n-1]+ findKnapSackProfitHelper(capacity - weights[n-1], weights, values , n-1),
                        findKnapSackProfitHelper(capacity, weights, values, n-1));
        } else {
            return  findKnapSackProfitHelper(capacity, weights, values , n-1);
        }

    }
}
