Find the target via modified binary search: at each step, one half is sorted; pick the half that can contain the target.

1. Set l=0, r=n-1.

2. While l <= r:
   mid = l + (r-l)/2. If nums[mid] == target, return mid.
    If left half is sorted (nums[l] <= nums[mid]):
    If nums[l] <= target < nums[mid], set r = mid - 1; else l = mid + 1.
    Else (right half is sorted):
    If nums[mid] < target <= nums[r], set l = mid + 1; else r = mid - 1.

3. If loop ends, return -1.
