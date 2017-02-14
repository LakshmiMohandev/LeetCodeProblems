/*
 * 476. Number Complement
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 */

public class Solution {
    public int findComplement(int num) {
        int mask = Integer.highestOneBit(num) * 2 - 1;
        return num^mask;
    }
}