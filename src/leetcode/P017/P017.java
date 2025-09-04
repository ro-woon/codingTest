package leetcode.P017;

import java.util.*;

public class P017 {
    // Mapping from digit to corresponding letters (index 0/1 unused)
    private static final String[] MAP = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        // Edge case: empty input -> no combinations
        if (digits == null || digits.isEmpty()) return Collections.emptyList();

        List<String> result = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        backtrack(digits, 0, path, result);
        return result;
    }

    // Backtracking: build combinations digit by digit
    private void backtrack(String digits, int idx, StringBuilder path, List<String> res) {
        // If we placed a letter for every digit, record the combination
        if (idx == digits.length()) {
            res.add(path.toString());
            return;
        }

        // Get letters for current digit
        int d = digits.charAt(idx) - '0';
        String letters = MAP[d];

        // Try each letter and recurse
        for (int i = 0; i < letters.length(); i++) {
            path.append(letters.charAt(i));
            backtrack(digits, idx + 1, path, res);
            path.deleteCharAt(path.length() - 1); // backtrack
        }
    }
}
