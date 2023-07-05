package leeCode;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int t = 9;
        bs.search(nums, t);

    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid = (r - l) / 2 + l;
        while (l <= r) {
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
