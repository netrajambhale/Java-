import java.util.Scanner;

public class Transposematrix {
    public static void main(String args[]) {
        int i, j;
        System.out.println("Enter total rows and columns: ");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int column = s.nextInt();
        int a[][] = new int[row][column];
        System.out.println("Enter matrix:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                a[i][j] = s.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("Before Transpose is ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("After Transpose is ");
        for (i = 0; i < column; i++) {
            for (j = 0; j < row; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}