package leeCode;

/**
 * 最大子数组和
 * 你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 */

public class MaxSubArray {
    public static void main(String[] args) {
        MaxSubArray ms = new MaxSubArray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        ms.maxSubArray(nums);

    }

    public int maxSubArray(int[] nums) {
        // pre 来维护对于当前 f(i)的 f(i−1) 的值是多少
        int pre = 0;
        int maxSum = nums[0];
        for (int num : nums) {
            pre = Math.max(num, pre + num);
            maxSum = Math.max(pre, maxSum);
        }
        return maxSum;
    }
}
