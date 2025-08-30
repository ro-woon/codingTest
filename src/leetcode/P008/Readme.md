This solution converts a string to a 32-bit signed integer by simulating the behavior of the C/C++ atoi function.

1. Skip leading whitespaces.

2. Handle the sign if the next character is '+' or '-'.

3. Read digits until a non-digit is found or the end of the string.

4. Stop conversion if no digits are found, return 0.

5. Clamp the result within the 32-bit signed integer range [-2^31, 2^31 - 1].

6. Return the integer as the final result.
