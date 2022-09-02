package String;

/* Time = O(n^2), Space = O(1)............Can also be done with DP with Time = O(n^2) and Space= O(n^2) */

public class LongestPallindromicSubstring {

    public static void main(String[] args) {

        String s1 = "babad";
        String s2 = "ab";
        String s3 = "abacdfgdcaba";

        String res1 = longestPalindrome(s1);
        String res2 = longestPalindrome(s2);
        String res3 = longestPalindrome(s3);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

    public static String longestPalindrome(String s) {

        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;

    }
}
