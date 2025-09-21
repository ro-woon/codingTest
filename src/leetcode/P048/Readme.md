Given an `n x n` 2D matrix, rotate the image by 90 degrees (clockwise) in-place.

1. Initialize:
    - Let `n` be the length of the matrix.

2. Transpose the matrix:
    - For each `i` from `0` to `n-1`:
        - For each `j` from `i+1` to `n-1`:
            - Swap `matrix[i][j]` with `matrix[j][i]`.

3. Reverse each row:
    - For each `i` from `0` to `n-1`:
        - Set two pointers `l = 0` and `r = n-1`.
        - While `l < r`:
            - Swap `matrix[i][l]` with `matrix[i][r]`.
            - Increment `l` and decrement `r`.

4. After these two steps, the matrix is rotated 90 degrees clockwise in-place.
