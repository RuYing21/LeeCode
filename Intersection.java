package leeCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/*
两个数组的交集
给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 */
public class Intersection {
    public static void main(String[] args) {
        Intersection in = new Intersection();
        int[] nums1 = {1,3,5,9};
        int[] nums2 = {2,3,4,7};
        in.intersection01(nums1,nums2);

    }


    public int[] intersection01(int[] nums1,int[] num2){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num,1);
        }
        Set<Integer> num22 = new HashSet();

        for (int num:num2){
            if(map.containsKey(num)){
                num22.add(num);
            }
        }
        // 把set2 的元素 放到数组中
        int[] res = new int[num22.size()];
        int index =0;
        for (int num:num22){
            res[index++] = num;
        }
        for (int re:res){
            System.out.println(re);
        }
        return res;

    }



    public int[] intersection02(int[] nums1,int[] num2){

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        // 对nums1 去重 得到set1
        for(int num : nums1){
            set1.add(num);
        }
        //  对nums2 去重，并只保留set1中包含的元素  得到set2
        for (int num:num2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        int[] res = new int[set2.size()];
        int index = 0;
        for (int num:set2){
            res[index] = num;
            index ++;
        }
//        for (int re:res){
//            System.out.println(re);
//        }
        return res;

    }
}
