This solution uses bit manipulation with shifting to perform integer division without using multiplication, division, or modulo operators.  
By repeatedly subtracting the largest shifted divisor from the dividend, we can build the quotient efficiently.

1. We first handle the overflow case: when dividend is Integer.MIN_VALUE and divisor is -1, the result exceeds the integer range, so we return Integer.MAX_VALUE.

2. We determine the sign of the result by checking if dividend and divisor have different signs.

3. We convert both dividend and divisor to positive long values to avoid overflow issues during absolute value conversion.

4. From the highest bit (31) down to 0, we check if `(a >> i) >= b`.
    - This is equivalent to checking if `a >= (b << i)`.
    - If true, it means `(b << i)` fits into the remaining dividend.
    - We then subtract `(b << i)` from `a` and add `(1 << i)` to the result.

5. After finishing the loop, we apply the sign to the result and return it.

💡 Note: In practice, this problem can also be solved much more simply by 
just performing `dividend / divisor` with an additional overflow check for the `Integer.MIN_VALUE / -1` case.
