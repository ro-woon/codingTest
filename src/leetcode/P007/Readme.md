This solution reverses the digits of an integer by popping digits one by one and pushing them into the result, 
while checking for overflow before each step.

1. Pop the last digit using modulo.

2. Check if adding this digit would cause overflow or underflow.

3. Multiply the current result by 10 and add the digit.

4. Repeat until all digits are processed.
