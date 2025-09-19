Given an array of non-negative integers `nums`, where each element represents your maximum jump length at that position, return the minimum number of jumps needed to reach the last index.

1. Initialize:
    - Let `jumps = 0` (count of jumps).
    - Let `curEnd = 0` (the farthest index we can reach with current jump).
    - Let `curFarthest = 0` (the farthest index we can reach overall).

2. Iterate through `nums` (except the last index):
    - Update `curFarthest = max(curFarthest, i + nums[i])`.
    - If `i == curEnd`:
        - Increment `jumps`.
        - Update `curEnd = curFarthest`.

3. At the end of iteration, `jumps` is the minimum number of jumps required.

4. Return `jumps`.
