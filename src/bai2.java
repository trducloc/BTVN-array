public class bai2 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 10000000; i++) {
            if (checkSnt(i) && allDigitsPrime(i) && reverseNumber(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean checkSnt(int n){
        if(n==0||n==1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public static boolean allDigitsPrime(int n){
        int[] a = new int[10];
        int i=0;
        while(n>0){
            a[i] = n % 10;
            n = n / 10;
            i++;
        }
        for(int j=0;j<i;j++) {
            if (!checkSnt(a[j]))
                return false;
        }
        return true;
    }

    private static boolean reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int number = n % 10;
            reverse = reverse * 10 + number;
            n /= 10;
        }
        return checkSnt(reverse);
    }
}
