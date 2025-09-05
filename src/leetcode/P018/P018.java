package leetcode.P018;

import java.util.*;

public class P018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) return res;

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Prune with min/max sums for i
            long minI = (long)nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3];
            if (minI > target) break; // further i only increases sum
            long maxI = (long)nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3];
            if (maxI < target) continue; // need larger i

            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // Prune with min/max sums for j
                long minJ = (long)nums[i] + nums[j] + nums[j + 1] + nums[j + 2];
                if (minJ > target) break; // further j increases sum
                long maxJ = (long)nums[i] + nums[j] + nums[n - 1] + nums[n - 2];
                if (maxJ < target) continue;

                int l = j + 1, r = n - 1;

                while (l < r) {
                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        // Move l and r skipping duplicates
                        int lv = nums[l], rv = nums[r];
                        while (l < r && nums[l] == lv) l++;
                        while (l < r && nums[r] == rv) r--;
                    } else if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return res;
    }
}
