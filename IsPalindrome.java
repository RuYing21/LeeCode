package leeCode;

public class IsPalindrome {
    public static void main(String[] args) {
        IsPalindrome ip = new IsPalindrome();
        int num = 321;
        ip.isPalindroma(num);

    }

    public boolean isPalindroma(int num) {
        if (num < 0)
            return false;
        int p = 0;
        int temp = num;
        while (temp > 0) {
            p = p * 10 + temp % 10; // p=0,求出个位数字，
            temp /= 10; //求出前两位数字
        }
        System.out.println(p);
        return p == num;

    }
}
