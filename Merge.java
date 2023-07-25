package leeCode;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        Merge mer = new Merge();
        int[] nums1 = {1,2,3,0,0,0};
        int  m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        mer.merge02(nums1,m,nums2,n);

    }

    /**
     * 合并两个有序数组
     * 1 合并后排序
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge01(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0;i< n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);

    }

    /**
     * 尾插法
     */
    public void merge02(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1; // 指向num的最后一位
        m--;
        n--;
        while (n >= 0){
            // num1[m] 是num1的最后一位非0有效数字， 和nums2[n] 依次比较,
            while (m >= 0 && nums1[m] > nums2[n]){
                // num1[m]大，则num1[m] 后移，m--
                nums1[len--] = nums1[m--];
            }

            // nums2[n]大 则num2[n]插入到num1[len],n-1
            nums1[len--] = nums2[n--];
        }
    }
}
