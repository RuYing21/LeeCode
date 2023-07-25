package leeCode;

/*
最长公共前缀
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strings = {"cir", "car","cip"};
        lcp.longestCommonPrefix(strings);

    }

    public String longestCommonPrefix(String[] strings) {
        if (strings.length == 0 || strings == null)
            return "";
        String prefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            prefix = longCommonPrefix(prefix, strings[i]);
            if (prefix.length() == 0)
                break;
        }
//        System.out.printf(prefix);
        return prefix;

    }

    public String longCommonPrefix(String str1, String str2) {
        int n = Math.min(str1.length(), str2.length());
        int l = 0;
        while (l < n && str1.charAt(l) == str2.charAt(l)) {
            l++;
        }
        return str1.substring(0, l);
    }



}
