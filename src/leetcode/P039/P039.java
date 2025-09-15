package leetcode.P039;

import java.util.*;

public class P039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }

    private void dfs(int[] a, int start, int remain, List<Integer> path, List<List<Integer>> res) {
        if (remain == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < a.length; i++) {
            if (a[i] > remain) break;
            path.add(a[i]);
            dfs(a, i, remain - a[i], path, res);
            path.remove(path.size() - 1);
        }
    }
}
