package leeCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        int[] nums = {0, 1};
        System.out.println(mn.missingNumber01(nums));
        ;

    }


    public int missingNumber01(int[] nums) {
//        int max = 0 ;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
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


    public int missingNumber02(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i <= n; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return n;
    }
}
