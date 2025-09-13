class Solution {
    public int myAtoi(String s) {
         if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();
        int sign = 1;
        long result = 0;
        int INT_MAX = Integer.MAX_VALUE; // 2^31 - 1 = 2147483647
        int INT_MIN = Integer.MIN_VALUE; // -2^31 = -2147483648

        // Step 1: Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Check for sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Read digits and build the number
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow and clamp the result
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? INT_MAX : INT_MIN;
            }

            result = result * 10 + digit;
            i++;
        }

        return (int) (sign * result);
    }
}