/*
 * 461. Hamming Distance
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 */

public class Solution {
    public int hammingDistance(int x, int y) {
        int count;
        return count = Integer.bitCount(x ^ y);
    }
}