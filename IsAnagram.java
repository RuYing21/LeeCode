package leeCode;

/*
有效的字母异位词
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class IsAnagram {
    public static void main(String[] args) {
        IsAnagram ia = new IsAnagram();
        String s1 = "anagram";
        String s2 = "nagara";
        System.out.println(ia.isAnagram(s1,s2));

    }

    public boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length())
            return false;
        // 初始化一个26位的数组，标记各个字符出现的次数  s1的字符出现时，出现次数+1  s2的字符出现时，出现次数-1
        // 若两个字符串为字母异位词，最后数组应全部为0
        int[] alpha = new int[26];
        for (int i = 0; i< s1.length(); i++){
            alpha[s1.charAt(i) - 'a'] ++;
            alpha[s2.charAt(i) - 'a'] --;
        }
        for (int i = 0;i<26;i++){
            if(alpha[i] != 0)
                return false;
        }
        return true;
    }
}
