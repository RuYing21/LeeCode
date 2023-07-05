package leeCode;

public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome ip = new IsPalindrome();
        int num = 12321;
        System.out.println(ip.isPalindrome(num));

    }

    public boolean isPalindrome(int num) {
        if(num < 0)
            return false;
        int y = 0;
        int x = num;

        while (x > 0) {
            y = x % 10 + y * 10;
            x = x / 10;


        }
        return num == y;
    }
}
