package leeCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] nums = {0, 1};
        System.out.println(mn.missingNumber02(nums));
        ;

    }


    /**
     *
     * @param nums
     * @return
     */
    public int missingNumber01(int[] nums) {
//        int max = 0 ;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        // 用map 的value 标记哪个数组出现过
        for (int num : nums) {
//            max = Math.max(num,max);
            map.put(num, 1);
        }

        for (int i = 0; i <= n; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return 0;
    }


    /**
     * 丢失的数字
     * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
     * @param nums
     * @return
     */
    public int missingNumber02(int[] nums) {
        // 对数组排序
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            // 下标 == nums[i]  则数组存在
            if (i != nums[i]) {
                return i;
            }
        }
        // 遍历结束没有返回，则返回数组长度 如[0,1,2] 3个数，返回3
        return n;
    }
}
