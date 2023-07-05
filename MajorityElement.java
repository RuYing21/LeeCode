package leeCode;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] nums = {1, 3, 3, 5, 3};
        me.majorityElement02(nums);
    }

    public int majorityElement01(int[] nums) {
        Arrays.sort(nums);
        System.out.println(nums[nums.length / 2]);
        return nums[nums.length / 2];
    }


    public int majorityElement02(int[] nums) {
        int winner = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (winner == nums[i]) {
                count++;
            } else if (count == 0) {
                winner = nums[i];
                count++;
            } else {
                count--;
            }
        }
        return winner;
    }
}
