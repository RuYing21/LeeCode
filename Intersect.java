package leeCode;

import java.util.*;
/*
两个数组的交集
给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
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
        // map key：value =  数组nums1 元素：元素出现的次数
        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] res = new int[nums1.length]; //选取num1或nums2长度都可，但最好选取较短长度
        int index = 0;
        for(int num : nums2) {
            // 判断：1、nums2的元素出现在nums1中  且  出现的次数大于0
            if(map.containsKey(num) && map.get(num) > 0) {
                // 存放到新的交集数组中
                res[index++] = num;
                // map 中元素出现的次数-1
                map.put(num, map.get(num) - 1);
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }


}
