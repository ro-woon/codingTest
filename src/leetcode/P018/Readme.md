This solution finds all unique quadruplets in the array that sum up to the given target by combining sorting, 
two nested loops, and the two-pointer technique, while skipping duplicates and pruning unnecessary searches.

1. Sort the array to simplify duplicate handling and allow two-pointer traversal.

2. Fix the first number (i) using a loop, skipping duplicates and pruning with minimum/maximum possible sums.

3. Fix the second number (j) with another loop, also skipping duplicates and applying pruning.

4. Use two pointers (l, r) to scan the remaining part of the array and adjust them based on the current sum compared to the target.

5. When a quadruplet matches the target, add it to the result list and move both pointers, skipping over duplicates.

6. Repeat until all possibilities are explored, ensuring only unique quadruplets are collected.
