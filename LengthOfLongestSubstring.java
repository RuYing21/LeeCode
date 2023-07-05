package leeCode;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        LengthOfLongestSubstring text = new LengthOfLongestSubstring();
        text.lengthOfLongestSubstring("abcddabcde");

    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left,map.getOrDefault(s.charAt(i),-1) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);

        }
        System.out.println(max);

        return max;
    }
}
