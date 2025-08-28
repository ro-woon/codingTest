package leetcode.P006;

public class P006 {

    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Prepare a StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;          // current row
        int step = 1;         // direction (down = 1, up = -1)

        for (char c : s.toCharArray()) {
            rows[row].append(c);

            // Reverse direction when reaching the top or bottom row
            if (row == 0) {
                step = 1;
            } else if (row == numRows - 1) {
                step = -1;
            }
            row += step;
        }

        // Concatenate all rows to form the final string
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : rows) {
            result.append(sb);
        }
        return result.toString();
    }
}
