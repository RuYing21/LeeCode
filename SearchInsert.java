package leeCode;

public class SearchInsert {
    public static void main(String[] args) {
        SearchInsert si = new SearchInsert();
        int[] nums = {1,3,5,7};
        int tar = 2;
        si.serchInsert(nums,tar);

    }

    public int serchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }else return mid; // target 存在，则是mid
        }
        return left; // target 不存在， 返回left
    }
}
