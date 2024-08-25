package com.villuri.playground;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class TwoPointersTest {


    @Test
    public void testPalindrome() {

        Map<String, Boolean> wordMap = new HashMap<String, Boolean>();
        wordMap.put("RACEACAR", false);
        wordMap.put("A", true);
        wordMap.put("ABCDEFGFEDCBA", true);
        wordMap.put("ABC", false);
        wordMap.put("ABCBA", true);
        wordMap.put("ABBA", true);
        wordMap.put("RACECAR", true);

        for (Map.Entry<String, Boolean> entry : wordMap.entrySet()) {
            assertEquals(new Boolean(TwoPointers.isPalindrome(entry.getKey())), entry.getValue());
        }
    }

}