package com.villuri.playground;

/**
 * Hello world!
 *
 */
public class TwoPointers
{
    public static void main( String[] args )
    {

        System.out.println(isPalindrome("abaaba"));
    }

    public static boolean isPalindrome(String word) {

        int p1 = 0;
        int p2 = word.length() - 1;

        if (p1 == p2)
            return true;

        while (p1 < p2) {
            if (word.charAt(p1) == word.charAt(p2)) {
                p1++;
                p2--;
                continue;
            }
            else {
                return false;
            }
        }
        return  true;
    }
}
