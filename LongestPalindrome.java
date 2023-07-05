package leeCode;
/*
最长回文子串
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome lc = new LongestPalindrome();
        String s = "a";
        lc.longestPalindrome(s);

    }

    // 回文字符串
    public boolean isPalindrome(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub) && sub.length() > max) {
                    ans = s.substring(i, j);
                    max = sub.length();
                }

            }
        }
        System.out.println(ans);
        return ans;
    }
}
