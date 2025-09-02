This solution uses sorting + a two-pointer technique: 
fix one index and use two pointers to find a complementary pair that sums to the negative of the fixed value, 
while skipping duplicates to ensure unique triplets.

1. Sort the array in non-decreasing order.

2. Loop i from 0 to n-3:
      + If i > 0 and nums[i] == nums[i-1], skip to avoid duplicate triplets.
      + Set two pointers: l = i + 1, r = n - 1, and target = -nums[i].

3. While l < r:
      + Compute sum = nums[l] + nums[r].
      + If sum == target, record [nums[i], nums[l], nums[r]], then move l and r inward skipping equal values to avoid duplicates.
      + If sum < target, increment l; otherwise decrement r.

4. Repeat for all i and return the list of unique triplets.
