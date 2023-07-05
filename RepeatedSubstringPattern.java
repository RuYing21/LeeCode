package leeCode;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        RepeatedSubstringPattern rsp = new RepeatedSubstringPattern();
        String s = "abab";
        String s1 = String.valueOf(rsp.repeatedSubstringPattern(s));
        System.out.println(s1);

    }


    public boolean repeatedSubstringPattern(String s) {
        /*
        解法1:移位法
         */
        int n = s.length();
        return (s + s).substring(1, n + n / 2).contains(s);
    }
}
