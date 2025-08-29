package leetcode.P007;

public class P007 {

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int d = x % 10;           // pop the last digit
            x /= 10;

            // Check for overflow before multiplying by 10 and adding the digit
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }

            res = res * 10 + d;       // push the digit to the result
        }
        return res;
    }
}
