package leeCode;

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 */

public class FindFirstUniqChar {
    public static void main(String[] args) {

    }

    public int  findFirstUniqChar(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(char s : str.toCharArray()){
            map.put(s,map.getOrDefault(s,0) +1 );
        }
        for (int i = 0;i<str.length();i++){
            if(map.get(str.charAt(i)) == 1){
                return i;
            }
        }
        return  -1;
    }
}
