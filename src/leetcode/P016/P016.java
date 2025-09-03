package leetcode.P016;

public class P016 {
    int minGap = Integer.MAX_VALUE;
    int value;

    public int threeSumClosest(int[] nums, int target) {
        search3Sum(nums, 0, 0, 0, target);
        return value;
    }

    public void search3Sum(int[] nums, int sum, int depth, int index, int target) {
        if (depth == 3) {
            if (sum == target) {
                minGap = 0;
                value = sum;
            } else if (Math.abs(target - sum) < minGap) {
                minGap = Math.abs(target - sum);
                value = sum;
            }
            return;
        }

        for (int i = index; i < nums.length; i++) {
            search3Sum(nums, sum + nums[i], depth + 1, i + 1, target);
        }
    }
}
