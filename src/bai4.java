import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang:   ");
        int n = new Scanner(System.in).nextInt();

        int[] a = inputMatrix(n);


        int[] result = maxSecond(a);
        if (result[0] != -1) {
            System.out.println("So lon thu 2 la: " + result[0]);
            System.out.println("Vi tri so lon thu 2 la: " + result[1]);
        }
        else {
            System.out.println("Khong co so lon thu hai");
        }
    }

    public static int[] inputMatrix(int n) {
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        return a;
    }
    public static int[] maxSecond (int[] a){
        int max1 = a[0];
        int max2 = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
                index = i - 1;
            } else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
                index = i;
            }
        }
        int[] result = {-1, -1};
        if (index != -1) {
            result[0] = max2;
            result[1] = index;
        }

        return result;
    }
}

