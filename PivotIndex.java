package leeCode;

public class PivotIndex {
    public static void main(String[] args) {
        PivotIndex pi = new PivotIndex();
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pi.pivotIndex(nums));;

    }

    /**
     * 寻找数组的中心下标
     * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums){
        int sum = 0;
        int leftsum = 0;
        for(int num: nums){
            sum+=num;
        }
        for (int i=0;i<nums.length;i++){
            leftsum += nums[i];
            if (leftsum - nums[i] == sum -leftsum ){
                return i;
            }
        }
        return -1;
    }
}
