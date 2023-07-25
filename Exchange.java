package leeCode;

/*
调整数组顺序使奇数位于偶数前面
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分
 */
public class Exchange {
    public static void main(String[] args) {
        Exchange ex  = new Exchange();
        int[] nums = {1,2,3,4,5};
        ex.exchange02(nums);

    }


    /*
    遍历两次数组，先找计数，放到新数组的前面，然后找偶数
     */
    public int[] exchange01(int[] nums){
        int[] res = new int[nums.length];
        int index = 0;
        for (int num:nums){
            if(num%2 != 0){
                res[index] = num;
                index++;
            }
        }
        for (int num:nums){
            if(num%2 == 0)
                res[index] = num;
            index++;
        }
        return res;

    }

    /*
    双指针
     */
    public int[] exchange02(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while(i < j) {
            // 从前往后找偶数
            while(i < j && (nums[i] & 1) == 1) i++;
            // 从后往前找奇数
            while(i < j && (nums[j] & 1) == 0) j--;
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        for(int num:nums){
            System.out.println(num);
        }
        return nums;
    }

}
