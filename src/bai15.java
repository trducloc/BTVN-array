import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        int n = new Scanner(System.in).nextInt();

        System.out.print("Nhap m: ");
        int m = new Scanner(System.in).nextInt();

        if (SNT(m, n)) {
            System.out.println(m + " va " + n + " la snt cung nhau");
        } else {
            System.out.println(m + " va " + n + " khong la snt cung nhau");
        }
    }

    public static boolean SNT(int m, int n) {
        if (m == 0 || n == 0) {
            return false;
        }
        for (int i = 2; i <= Math.min(m, n); i++) {
            if (m % i == 0 && n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

