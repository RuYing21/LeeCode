package leeCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String args[]) {
        TwoSum t = new TwoSum();
        int[] nums = new int[]{1, 3, 6, 9, 11};
        int target = 15;
        t.twoSum02(nums,target);

    }

    /**
     * 两数之和 - 暴力解法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum01(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("下标"+ i + j);
                    return new int[]{i, j};

                }
            }
        }
        return new int[0];
    }

    /**
     * 两数之和 -- map解法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum02(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        // key:nums[i]  value:下标
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
//                System.out.println("下标"+ i +":"+ nums[i]);
                // 返回数组
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
//            System.out.println("下标"+ i +":"+ nums[i]);

        }

        throw new IllegalArgumentException("No two sum solution");
    }
}





