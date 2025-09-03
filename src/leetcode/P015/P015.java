package leetcode.P015;

import java.util.*;

public class P015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates for i
            if (nums[i] > 0) break; // all remaining are positive -> cannot sum to 0 (optional)

            int l = i + 1, r = n - 1;
            int target = -nums[i];

            while (l < r) {
                int sum = nums[l] + nums[r];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    int lv = nums[l], rv = nums[r];
                    while (l < r && nums[l] == lv) l++; // skip duplicates for l
                    while (l < r && nums[r] == rv) r--; // skip duplicates for r
                } else if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}
