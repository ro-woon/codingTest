package P034;

public class P034 {
    public int[] searchRange(int[] nums, int target) {
        int left = lowerBound(nums, target);       // first index >= target
        if (left == nums.length || nums[left] != target) return new int[]{-1, -1};
        int right = upperBound(nums, target) - 1;  // last index == target
        return new int[]{left, right};
    }

    private int lowerBound(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] >= x) r = m; else l = m + 1;
        }
        return l;
    }

    private int upperBound(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] > x) r = m; else l = m + 1;
        }
        return l;
    }
}
