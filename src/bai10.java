import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {

        System.out.print("Nhap m: ");
        int m = new Scanner(System.in).nextInt();

        System.out.print("Nhap n: ");
        int n = new Scanner(System.in).nextInt();

        countSCP(m, n);
    }

    public static boolean checkSCP(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }

    public static void countSCP(int m, int n) {
        System.out.println("Cac so chinh phuong trong doan [" + m + ", " + n + "] la:");
        int count = 0;
        if ((m >= 0 && n >= 0) || n >=0) {
            for (int i = m; i <= n; i++) {
                if (0 <= i) {
                    if (checkSCP(i)) {
                        System.out.println(i);
                        count++;
                    }
                }
            }
            System.out.println("Co " + count + " so chinh phuong trong doan [" + m + ", " + n + "]");
        }

    }

}