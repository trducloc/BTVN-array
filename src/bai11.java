import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        System.out.print("Nhap so dong cua ma tran: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int m = new Scanner(System.in).nextInt();

        int[][] a = inputMatrix(m,n);
        findMinMax(a);
    }

   public static int[][] inputMatrix(int m,int n){
       int[][] a = new int[n][m];

       for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
               System.out.print("a["+i+"]["+j+"] = ");
               a[i][j] = new Scanner(System.in).nextInt();
           }
       }
       return a;

   }
    private static void findMinMax(int[][] a) {
        int min = a[0][0];
        int max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }

                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
