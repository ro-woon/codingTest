Find the product of two non-negative integers given as strings `num1` and `num2`.

1. Initialize an integer array `pos` of size `m + n`, where `m` and `n` are the lengths of `num1` and `num2`.

2. Multiply each digit:
    - For each `i` from `m-1` down to `0`:
        - For each `j` from `n-1` down to `0`:
            - Compute `mul = (num1[i]-'0') * (num2[j]-'0')`.
            - Add to `pos[i + j + 1]` and handle carry by updating `pos[i + j]`.

3. Build the result string:
    - Skip leading zeros.
    - Append digits from `pos` into the final string.

4. Return `"0"` if the result string is empty.
