package com.villuri.playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicProgrammingTest {

    @Test
    public void testKnapSackProfileHelper() {
        int[][] weights = {
                { 1, 2, 3, 5 },
                { 4 },
                { 2 },
                { 3, 6, 10, 7, 2 },
                { 3, 6, 10, 7, 2, 12, 15, 10, 13, 20 }
        };

        int[][] values = {
                { 1, 5, 4, 8 },
                { 2 },
                { 3 },
                { 12, 10, 15, 17, 13 },
                { 12, 10, 15, 17, 13, 12, 30, 15, 18, 20 }
        };

        int[] capacity = { 6, 3, 3, 10, 20 };

        int[] expectedProfit = { 10, 0, 3, 0, 55};

        for ( int i =0; i<= capacity.length-1; i++) {
            assertEquals(expectedProfit[i], DynamicProgramming.findMaxKnapsackProfit(capacity[i], weights[i], values[i]));
        }
    }

}