import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {

        System.out.print("Nhập số tự nhiên n: ");
        int n = new Scanner(System.in).nextInt();
        double sum = tinhTong(n);
        System.out.println("Tổng S = 1+ 1/2 + 1/3 + ... + 1/n là: " + sum);
    }
    public static double tinhTong (double n){
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 1 / i;
        }
        return sum;

    }
}
