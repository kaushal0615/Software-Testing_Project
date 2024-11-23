package org.example;

public class BitManipulationHelper {

    /**
     * Updates the 32-bit array representation of a number by adding or removing bits.
     *
     * @param bit32 the 32-bit array representing the OR results
     * @param num the number to add or remove
     * @param op the operation ('+' to add, '-' to remove)
     */
    public void updateBitArray(int[] bit32, int num, char op) {
        int m = 0;
        while (num > 0) {
            if (op == '+') {
                bit32[m++] += num % 2;
            } else if (op == '-') {
                bit32[m++] -= num % 2;
            }
            num /= 2;
        }
    }

    /**
     * Converts a 32-bit array back into an integer.
     *
     * @param bit32 the 32-bit array representing the OR results
     * @return the integer representation
     */
    public int bitArrayToDecimal(int[] bit32) {
        int num = 0;
        for (int i = 0; i < 32; i++) {
            if (bit32[i] > 0) {
                num |= (1 << i);
            }
        }
        return num;
    }
}
