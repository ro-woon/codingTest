Find the next lexicographical permutation in place: locate the smallest increase, then minimize the tail.

1. From the right, find the first index i with nums[i] < nums[i+1].
    If none (array is non-increasing), reverse the whole array and return.

2. From the right, find the first index j with nums[j] > nums[i].

3. Swap nums[i] and nums[j].

4. Reverse nums[i+1 … end] to make the suffix minimal.
