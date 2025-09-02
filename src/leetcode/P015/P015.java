package leetcode.P015;

import java.util.*;

public class P015 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        search3Sum(nums, 0, 0, 0, new int[3]);
        return result;
    }

    public void search3Sum(int[] nums, int sum, int depth, int index, int[] tmp) {
        if (depth == 3) {
            if (sum == 0) result.add(java.util.Arrays.stream(tmp).boxed().toList());
            return;
        }

        for (int i = index; i < nums.length; i++) {
            tmp[depth] = nums[i];
            search3Sum(nums, sum += nums[i], depth + 1, i + 1, tmp);
        }
    }
}
