package leeCode;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement rd = new RemoveElement();
        int[] ans = {1, 2, 4, 4, 5};
        int val = 1;

        rd.removeElement02(ans, val);

    }

    public int removeElement01(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int n = 0;
        for (int num : nums) {
            if (num != val) {
                nums[n] = num;
                n++;
            }
        }
        System.out.println(n);
        return n;
    }

    public int removeElement02(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
            
        }
        System.out.println(left);
        return left;
    }
}
