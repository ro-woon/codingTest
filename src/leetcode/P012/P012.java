package leetcode.P012;

public class P012 {
    public String intToRoman(int num) {
        String baseNum = String.valueOf(num);

        char[] number = baseNum.toCharArray();
        int digit = number.length;
        StringBuilder sb = new StringBuilder();
        int index = 0;

        if (digit == 4) {
            int tmp = number[index] - '0';
            sb.append("M".repeat(tmp));
            index++;
            digit--;
        }

        if (digit == 3) {
            int tmp = number[index] - '0';
            if (tmp == 9) sb.append("CM");
            else if (tmp == 4) sb.append("CD");
            else if (tmp < 4) sb.append("C".repeat(tmp));
            else {
                tmp -= 5;
                sb.append("D").append("C".repeat(tmp));
            }

            index++;
            digit--;
        }

        if(digit == 2) {
            int tmp = number[index] - '0';
            if (tmp == 9) sb.append("XC");
            else if (tmp == 4) sb.append("XL");
            else if (tmp < 4) sb.append("X".repeat(tmp));
            else {
                tmp -= 5;
                sb.append("L").append("X".repeat(tmp));
            }
            index++;
            digit--;
        }
        if(digit == 1) {
            int tmp = number[index] - '0';
            if (tmp == 9) sb.append("IX");
            else if (tmp == 4) sb.append("IV");
            else if (tmp < 4) sb.append("I".repeat(tmp));
            else {
                tmp -= 5;
                sb.append("V").append("I".repeat(tmp));
            }
        }

        return sb.toString();
    }
}
