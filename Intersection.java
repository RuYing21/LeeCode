package leeCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        for(int num : nums1){
            set1.add(num);
        }

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

        for (int re:res){
            System.out.println(re);
        }
        return res;

    }
}
