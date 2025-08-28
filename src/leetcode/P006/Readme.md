This solution simulates the zigzag pattern by iterating through characters row by row and 
toggling the direction when reaching the first or last row.

1. Keep an array of StringBuilder for each row.

2. Traverse the string, append characters row by row.

3. Change direction when the top or bottom is reached.

4. Join all rows to build the final result.

Time Complexity: O(n)
Space Complexity: O(n)
