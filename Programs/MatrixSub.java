
import java.util.Scanner;

class MatrixSub {
    public static void main(String args[]) {
        int row, col, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        row = sc.nextInt();

        System.out.println("Enter the number columns");
        col = sc.nextInt();

        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int sub[][] = new int[row][col];

        System.out.println("Enter the elements of matrix 1");

        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++)
                a[i][j] = sc.nextInt();

            System.out.println();
        }
        System.out.println("Enter the elements of matrix 2");

        for (i = 0; i < row; i++) {

            for (j = 0; j < col; j++)
                b[i][j] = sc.nextInt();

            System.out.println();
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                sub[i][j] = a[i][j] - b[i][j];

            }
        }

        System.out.println("Sum of matrices:");

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(sub[i][j] + "\t");

            }

            System.out.println();
        }

    }
}