package leeCode;

import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        FrequencySort fs = new FrequencySort();
        String s = "tree";
        System.out.println(fs.frequencySort(s));

    }

    /**
     * 根据字符出现频率排序
     * 给定一个字符串 s ，根据字符出现的 频率 对其进行 降序排序 。一个字符出现的 频率 是它出现在字符串中的次数。
     * @param s
     * @return
     */
    public String frequencySort(String s) {

        // map 存放字符串中的字符 出现的频率
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // list 存放去重后的map的key 即s 的字符
        List<Character> list = new ArrayList<>(map.keySet());
        // 对list 按照字符出现频率排序  降序
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            char c = list.get(i);
            int fre = map.get(c);
            // 多次出现的字符 按出现次数添加
            for (int j = 0; j < fre; j++) {
                sb.append(c);
            }
        }
        return sb.toString();


    }
}
