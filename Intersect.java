package leeCode;

import java.util.*;
/*
两个数组的交集
 */

public class Intersect {

    public static void main(String[] args) {
        Intersect in = new Intersect();
        int[] nums1 = {1,2,2,1};
        int[] num2 = {2,2,1};
        in.intersect(nums1,num2);
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] res = new int[nums1.length]; //选取num1或nums2长度都可，但最好选取较短长度
        int index = 0;
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                res[index++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }


}
