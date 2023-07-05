package leeCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

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


    public int[] twoSum02(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
//                System.out.println("下标"+ i +":"+ nums[i]);
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
//            System.out.println("下标"+ i +":"+ nums[i]);

        }
        throw new IllegalArgumentException("No two sum solution");
    }



    public static void main(String args[]) {
        TwoSum t = new TwoSum();
        int[] nums = new int[]{1, 3, 6, 9, 11};
        int target = 15;
        t.twoSum02(nums,target);

    }
}





