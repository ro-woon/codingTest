package leetcode.P050;

public class P050 {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) { x = 1 / x; N = -N; }

        double ans = 1.0;
        double base = x;
        while (N > 0) {
            if ((N & 1) == 1) ans *= base;
            base *= base;
            N >>= 1;
        }
        return ans;
    }
}
