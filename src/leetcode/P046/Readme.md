Given an array `nums` of distinct integers, return all possible permutations.

1. Initialize:
    - Let `result` be an empty list to store permutations.
    - Let `path` be a temporary list to store the current permutation.
    - Let `used` be a boolean array to track visited elements.

2. Define a recursive function `backtrack`:
    - If `path.size == nums.length`:
        - Add a copy of `path` to `result`.
        - Return.
    - Otherwise, iterate through `nums`:
        - If `used[i]` is true, skip.
        - Mark `used[i] = true` and add `nums[i]` to `path`.
        - Recursively call `backtrack`.
        - Remove last element from `path` and reset `used[i] = false`.

3. Call `backtrack` with initial state (empty `path`, all `used` false).

4. Return `result` as the list of all permutations.
