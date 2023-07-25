package leeCode;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int t = 9;
        bs.binarySearch(nums, t);

    }

    /**
     * 二分查找
     * @param nums
     * @param target
     * @return
     */
    public int binarySearch(int[] nums, int target) {
        int l = 0;
        // nums 为无序数组
//        int mid = (r - l) / 2 + l;
        int r = nums.length - 1;
        while (l <= r) {
            // nums 为有序数组
            int mid = (r - l) / 2 + l;
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                System.out.println(mid);
                return mid;
            }
        }
        return -1;
    }
}
