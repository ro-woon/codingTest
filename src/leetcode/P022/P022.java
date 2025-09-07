package leetcode.P022;

import java.util.*;

public class P022 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) {
            return res;
        }
        backtrack(n, 0, 0, new StringBuilder(), res);
        return res;
    }

    private void backtrack(int n, int open, int close, StringBuilder path, List<String> res) {
        if (path.length() == 2 * n) {
            res.add(path.toString());
            return;
        }
        // Add '(' if we still can
        if (open < n) {
            path.append('(');
            backtrack(n, open + 1, close, path, res);
            path.deleteCharAt(path.length() - 1);
        }
        // Add ')' only if it won't break validity
        if (close < open) {
            path.append(')');
            backtrack(n, open, close + 1, path, res);
            path.deleteCharAt(path.length() - 1);
        }
    }
}
