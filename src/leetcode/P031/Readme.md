This solution finds the next lexicographical permutation of an integer array in-place, using constant extra memory.  
The key idea is to identify a pivot point where the sequence can be made slightly larger, and then minimize the suffix to ensure the result is the immediate next permutation.

1. Starting from the right, find the first index `i` such that `nums[i] < nums[i+1]`.
    - This index is the pivot.
    - If no such index exists (the array is in descending order), then it is the last permutation, and we simply reverse the array to get the smallest permutation.

2. If a pivot is found, scan from the right again to find the first index `j` such that `nums[j] > nums[i]`.
    - Since we scan from the end, this ensures that `nums[j]` is the smallest number greater than `nums[i]`.

3. Swap the values at `nums[i]` and `nums[j]`.
    - This increases the permutation just enough to make it larger than the original.

4. Finally, reverse the subarray from `i+1` to the end.
    - The suffix was in descending order, so reversing it gives the smallest possible order, ensuring the whole array is the immediate next permutation.
