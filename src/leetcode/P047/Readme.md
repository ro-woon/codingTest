Given a collection `nums` that may contain duplicates, return all unique permutations.

1. Initialize:
    - Let `result` be an empty list to store permutations.
    - Let `path` be a temporary list to store the current permutation.
    - Let `used` be a boolean array to track visited elements.
    - Sort `nums` to handle duplicates.

2. Define a recursive function `backtrack`:
    - If `path.size == nums.length`:
        - Add a copy of `path` to `result`.
        - Return.
    - Otherwise, iterate through `nums`:
        - If `used[i]` is true, skip.
        - If `i > 0` and `nums[i] == nums[i-1]` and `!used[i-1]`, skip (avoid duplicates).
        - Mark `used[i] = true` and add `nums[i]` to `path`.
        - Recursively call `backtrack`.
        - Remove last element from `path` and reset `used[i] = false`.

3. Call `backtrack` with initial state (empty `path`, all `used` false).

4. Return `result` as the list of all unique permutations.
