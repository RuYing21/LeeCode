package leeCode;

public class DynamicSum {
    public static void main(String[] args) {
        DynamicSum ds = new DynamicSum();
        int[] nums = {1, 2, 3, 4};
        ds.dynamicSum02(nums);

    }

    public int[] dynamicSum01(int[] nums) {
        int num = 0;
        int n = nums.length;
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            num += nums[i];
            sum[i] = num;
            System.out.println(sum[i]);

        }
        return sum;
    }


    public int[] dynamicSum02(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i-1] + nums[i];
        }
//        for (int num:sum){
//            System.out.println(num);
//        }
        return sum;
    }
}
