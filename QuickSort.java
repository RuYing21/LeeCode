package leeCode;


public class QuickSort {

    public static void main(String[] args) {
        int i;
        int a[] = {30,40,60,10,20,50};

        System.out.printf("before sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");

        quickSort02(a, 0, a.length-1);

        System.out.printf("after  sort:");
        for (i=0; i<a.length; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }

        /**
         *
         * @param arr:待排序的数组
         * @param low：左边低位指针
         * @param high：右边高位指针
         */
        public static void quickSort(int[] arr,int low,int high){
            // 方法退出条件,指针相遇或低位大于高位指针
            if (low >= high) {
                return;
            }
            // 首先指定基准位和左右指针记录位置
            int pivot = arr[low];
            int l = low;
            int r = high;
            int temp = 0;
            // 左指针小于右指针则进行遍历
            while (l < r) {
                // 先进行右边遍历
                while (l < r && arr[r] >= pivot) {
                    r--;
                }
                // 左边遍历
                while (l < r && arr[l] <= pivot) {
                    l++;
                }
                // 当l指针还在r指针右侧（l<r），表示两指针还未相遇
                if (l < r) {
                    temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                }
            }
            // 当左右指针相遇，则交换基准位的位置
            arr[low] = arr[l];
            arr[l] = pivot;
            // 再根据条件进行左边递归遍历
            if (low < l) {
                quickSort(arr, low, l - 1);
            }
            // 根据条件右边进行递归遍历
            if (r < high) {
                quickSort(arr, r + 1, high);
            }
        }



    /*
     * 快速排序
     *
     * 参数说明:
     *     a -- 待排序的数组
     *     l -- 数组的左边界(例如，从起始位置开始排序，则l=0)
     *     r -- 数组的右边界(例如，排序截至到数组末尾，则r=a.length-1)
     */
    public static void quickSort02(int[] a, int l, int r) {

        if (l < r) {
            int i,j,x;

            i = l;
            j = r;
            x = a[i];
            while (i < j) {
                while(i < j && a[j] > x)
                    j--; // 从右向左找第一个小于x的数
                if(i < j)
                    a[i++] = a[j];
                while(i < j && a[i] < x)
                    i++; // 从左向右找第一个大于x的数
                if(i < j)
                    a[j--] = a[i];
            }
            a[i] = x;
            quickSort02(a, l, i-1); /* 递归调用 */
            quickSort02(a, i+1, r); /* 递归调用 */
        }
    }

}
