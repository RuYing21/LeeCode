package leeCode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public static void main(String[] args) {

    }

    public int firstUniqChar(String s ){
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        // map 存放字符出现的频次
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;

    }
}
