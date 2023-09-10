public class bai16 {

    public static void main(String[] args) {
        for (int i = 10001; i <= 9999999; i++) {
            if (checkSnt(i) && checkSoThuanNghich(i) && withOut4(i)) {
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

    public static boolean checkSoThuanNghich(int n) {
        String numberStr = String.valueOf(n);
        int size = numberStr.length();
        for (int i = 0; i < (size/2); i++) {
            if (numberStr.charAt(i) != numberStr.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean withOut4(int n) {
        while (n != 0) {
            if (n % 10 == 4) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

}
