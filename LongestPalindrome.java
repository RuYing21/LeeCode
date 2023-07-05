package leeCode;
/*
最长回文串
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome lp  = new LongestPalindrome();
        String s = "abccccdd";
        lp.longestPalindrome02(s);
    }

    /*
    * 找出现次数为奇数的字符，因为只能用1个，用总长度-奇数的个数 +1
    * */
    public int longestPalindrome(String s) {
        // 找出可以构成最长回文串的长度
        int[] arr = new int[128];
        for(char c : s.toCharArray()) {
            arr[c]++;
        }
        int count = 0;
        for (int i : arr) {
            count += (i % 2);
        }
        System.out.println(count);
        return count == 0 ? s.length() : (s.length() - count + 1);
    }


    /*
    * 出现次数为偶数的字符 +1（如果有出现次数为次数的字符）
    * */
    public int longestPalindrome02(String s) {
        char[] occurs = new char[128];

        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            occurs[c]++;
            if (occurs[c] == 2) {
                ans += 2;
                occurs[c] = 0;
            }
        }

        if (ans < s.length()) ans++;
        System.out.println(ans);
        return ans;
    }
}
