package leeCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

public class IsValidKuoHao {
    public static void main(String[] args) {
        IsValidKuoHao vk = new IsValidKuoHao();
        String s = "()[]{}";
        vk.isValid02(s);

    }

    public Boolean isValid01(String s){
        Map<Character,Character> map = new HashMap<Character,Character>(){{
            put('(',')');
            put('[',']');
            put('{','}');
            put('?','?');
        }} ;
        if(s.length() == 0 || !map.containsKey(s.charAt(0)))
            return false;
        LinkedList<Character> stack = new LinkedList<Character>(){{add('?');}};
        for (Character c : s.toCharArray()){
            if (map.containsKey(c))
                stack.addLast(c);
            else if(map.get(stack.removeLast()) != c)
                return false;
        }
        return stack.size() ==1;

    }

    // 栈 后进 先出
    public boolean isValid02(String s) {
        if(s.isEmpty())
            return true;
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.empty()||c!=stack.pop())
                return false;
        }
        if(stack.empty())
            return true;
        return false;
    }

}
