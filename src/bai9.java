public class bai9 {

    public static void main(String[] args) {
        for (int i = 100001; i <= 999999; i++) {
            if (isPalindrome(i) && i % 10 == 0 && (i / 10) % 10 == 0 && ((i / 100) % 10 + (i / 1000) % 10 + (i / 10000) % 10) % 10 == 0) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int original = n;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return original == reverse;
    }


}

