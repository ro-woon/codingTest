package leetcode.P005;

public class P005 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int center = 0; center < s.length(); center++) {
            // Odd-length palindrome (center is a single character)
            int len1 = expandFromCenter(s, center, center);

            // Even-length palindrome (center is between two characters)
            int len2 = expandFromCenter(s, center, center + 1);

            // Choose the longer length
            int len = Math.max(len1, len2);

            // Update the start and end indices if we found a longer palindrome
            if (len > end - start) {
                start = center - (len - 1) / 2;
                end = center + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Expand around the given center and return the palindrome length
    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of the palindrome
    }
}
