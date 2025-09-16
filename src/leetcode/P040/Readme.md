Find all unique combinations in `candidates` where the numbers sum to `target`.  
Each number may be used **at most once**. The solution set must not contain duplicates.

1. Sort the `candidates` array.

2. Use backtracking to explore combinations:
    - Keep a temporary list `temp` for the current path.
    - If the sum exceeds `target`, stop (pruning).
    - If the sum equals `target`, add a copy of `temp` to the result.

3. Skip duplicates:
    - When `i > start && candidates[i] == candidates[i-1]`, continue.

4. Move to the next index (`i + 1`) after choosing a number.
