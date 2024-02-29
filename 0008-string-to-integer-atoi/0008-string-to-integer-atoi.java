class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sb.append(s.charAt(i));
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            sb.append(s.charAt(i));
            i++;
        }
        if (sb.length() == 0 || (sb.length() == 1 && (sb.charAt(0) == '+' || sb.charAt(0) == '-'))) {
            return 0;
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return s.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
