This solution uses the sliding window technique to achieve an optimal time complexity of O(n).
Instead of checking duplicates repeatedly, we maintain a map that stores the last index of each character.

1. As we iterate through the string, if a character has already appeared within the current window,
we move the start pointer to the right of its previous index.

2. At each step, we update the maximum length of the window (end - start + 1).

3. Finally, the maximum length found during the traversal is returned.

This approach ensures that each character is processed at most twice, resulting in linear time complexity.
