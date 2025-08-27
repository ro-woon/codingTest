This solution uses the **Expand Around Center** technique with a time complexity of O(n²).

1. Each character (and the gap between two characters) is considered as a potential center.
    - Odd-length palindrome: center at one character
    - Even-length palindrome: center between two characters

2. From each center, we expand outward while the left and right characters are equal.

3. At every expansion, we track the longest palindrome substring found so far.

This approach avoids generating all substrings (O(n³)) and ensures an efficient O(n²) solution with O(1) extra space.
