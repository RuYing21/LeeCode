package leeCode;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt ro = new RomanToInt();
        String s = "LVIII" ;
        ro.romanToInt(s);

    }

    public  int romanToInt(String s){
        HashMap<String,Integer> map = new HashMap();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int sum = 0;
        int n = s.length();

        for(int i = 0; i< n-1; i++ ){
            String p = s.charAt(i) + "";
            String next = s.charAt(i+1) + "";
            if(map.get(p) < map.get(next)){
                sum -= map.get(p);
            }else {
                sum += map.get(p);
            }
        }
        sum = sum + map.get(s.charAt(n-1) + "");
        System.out.println(sum);
        return  sum;

    }

}
