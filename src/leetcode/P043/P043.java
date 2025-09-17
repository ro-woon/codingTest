package leetcode.P043;

public class P043 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length(), n = num2.length();
        int[] pos = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int a = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                int sum = a * b + pos[i + j + 1];

                pos[i + j]     += sum / 10;  // carry
                pos[i + j + 1]  = sum % 10;  // current digit
            }
        }

        StringBuilder sb = new StringBuilder();
        int k = 0;
        while (k < pos.length && pos[k] == 0) k++; // skip leading zeros
        for (; k < pos.length; k++) sb.append(pos[k]);

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
