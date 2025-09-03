This solution uses sorting + a two-pointer technique:
fix one index and move two pointers inward to approach the target sum;
always compute the current sum and update the best (closest) result.

1. Sort the array in non-decreasing order.

2. Loop i from 0 to n-3:
    Set two pointers: l = i + 1, r = n - 1.

3. While l < r:
    Compute sum = nums[i] + nums[l] + nums[r].
    If |sum - target| < |best - target|, update best = sum.
    If sum < target, increment l; otherwise decrement r.
    If sum == target, you can return immediately (exact match).

4. Repeat for all i and return best.
