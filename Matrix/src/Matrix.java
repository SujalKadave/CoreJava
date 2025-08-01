import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] sum = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of first 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

     
        System.out.println("Enter elements of second 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        
        System.out.println("Sum of the two matrices:");
        for (int[] row : sum) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
