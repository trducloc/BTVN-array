public class bai1 {
    public static void main(String[] args) {
        for (int i = 1000000; i < 1000000000; i++) {
            if (checkSoThuanNghich(i) && only068(i) && div10(i)) {
                System.out.println(i);
            }
        }
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

    public static boolean only068(int n) {
        while (n > 0) {
            int number = n % 10;
            if (number != 0 && number != 6 && number != 8) {
                return false;
            }
            n = n / 10;
        }
        return true;
    }

    public static boolean div10(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum % 10 == 0;
    }
}
