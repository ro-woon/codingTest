package leetcode.P038;

public class P038 {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 2; i <= n; i++) {
            s = next(s);
        }
        return s;
    }

    // Build the next term by "reading" the current term
    private String next(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            // when the group ends (i == len) or current char differs from previous
            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            } else {
                count++;
            }
        }
        return sb.toString();
    }
}
