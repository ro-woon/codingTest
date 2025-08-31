package leetcode.P011;

public class P011 {

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;

        while (l < r) {
            int h = Math.min(height[l], height[r]);
            ans = Math.max(ans, (r - l) * h);

            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }
}
