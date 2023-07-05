package leeCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] str = {"dog","racecar","car"};
        lcp.longestCommonPrefix(str);

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            // strs 包含的字符串,从第二个开始 循环和第一个字符串的字符逐位对比，直到字符不相等 ，返回子字符串
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
                System.out.println(strs[0].substring(0, i));
            }
        }
        return strs[0];
    }
}
