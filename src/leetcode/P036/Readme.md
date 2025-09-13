Validate a 9×9 board by ensuring rows, columns, and 3×3 boxes contain no duplicate digits ('1'..'9');
'.' means empty and diagonals are ignored.

1. Initialize three seen sets/arrays: row[9][9], col[9][9], box[9][9].

2. Scan each cell (r, c). If board[r][c] == '.', continue.

3. Let d = board[r][c] - '1' and b = (r/3)*3 + (c/3).
    If row[r][d] || col[c][d] || box[b][d] → return false.

4. Mark row[r][d] = col[c][d] = box[b][d] = true. After the scan, return true.
