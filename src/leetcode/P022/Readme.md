This solution uses a backtracking technique to generate all valid combinations of parentheses.
By keeping track of how many opening and closing brackets we have used, 
we ensure that every partial string is always valid during the construction process.

1. We start with an empty string and recursively add characters.

2. We may add an opening bracket '(' if we have not yet used all n opening brackets.

3. We may add a closing bracket ')' only if the number of closing brackets used is less than the number of opening brackets, which guarantees validity.

4. Once the constructed string reaches length 2n, it represents a valid combination and is added to the result list.
