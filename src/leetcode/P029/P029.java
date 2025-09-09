package leetcode.P029;

public class P029 {
    public int divide(int dividend, int divisor) {
        // Handle overflow case: MIN_VALUE / -1 would exceed integer range
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = ((dividend ^ divisor) < 0);

        // Convert both numbers to positive long values to avoid overflow
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        // Iterate from the highest bit to the lowest
        // If (a >> i) >= b, it means (b << i) can fit into 'a'
        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                // Subtract (b << i) from 'a'
                a -= (b << i);
                // Add the corresponding power of two to the result
                result += (1 << i);
            }
        }

        // Apply the sign
        return negative ? -result : result;
    }
}
