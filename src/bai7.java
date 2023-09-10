import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang:  ");
        int n = new Scanner(System.in).nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("a[ " + i + " ] = ");
            a[i] = new Scanner(System.in).nextInt();
        }
        if(mangDoiXung(a)){
            System.out.println("Mang vua nhap la mang doi xung");
            return;
        }
        System.out.println("Mang vua nhap khong la mang doi xung");
    }

    public static boolean mangDoiXung(int[] a) {
        int n = a.length;
        for(int i = 0; i < n / 2; i++){
            if(a[i] != a[n - 1 - i]){
                return false;
            }
        }
        return true;
    }
}

