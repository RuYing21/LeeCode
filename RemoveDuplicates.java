package leeCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates nums = new RemoveDuplicates();
        int[] s = {1,1,2,3,4,4,5};
        nums.removeDuplicate02(s);

    }

    public int removeDuplicates01(int[]  nums){
        int n = nums.length;
        if(n == 0)
            return 0;
        Set<Integer> list = new HashSet<>();
        for ( int i=0 ; i<n;i++){
            list.add(nums[i]);
        }
        int j  = list.size();
        System.out.println(j);
        return j;

    }

    public int removeDuplicate02(int[] nums){
        int n = nums.length;
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                nums[p+1] = nums[q];
                p++;
            }
            q++;
        }
        System.out.println(p+1);
        return p+1;
    }
}
