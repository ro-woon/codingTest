This solution builds all letter combinations by backtracking: pick a letter for the current digit,
append it to the path, and recurse to the next digit until a complete combination is formed.

1. If the input digits is empty, return an empty list.

2. Prepare a digit-to-letters map for '2'..'9' (e.g., 2→"abc", 3→"def", …).

3. Define backtrack(i, path):
    If i == digits.length, record path as a complete combination.
    Otherwise, iterate each letter c in map[digits[i]], append c to path, call backtrack(i+1, path), then remove c (backtrack).

4. Invoke backtrack(0, "") and return the collected list of combinations.
