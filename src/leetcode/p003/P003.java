package leetcode.p003;

import java.util.HashMap;
import java.util.Map;

public class P003 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        Map<Character, Integer> last = new HashMap<>();
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            if (last.containsKey(c) && last.get(c) >= start) {
                start = last.get(c) + 1;
            }

            last.put(c, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
