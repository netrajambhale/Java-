import java.util.Scanner;

class Matrixmul {
    public static void main(String args[]) {
        int r1, r2, c1, c2, i, j, k, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows of matrix1");
        r1 = sc.nextInt();
        System.out.println("Enter the number columns of matrix 1");
        c1 = sc.nextInt();

        System.out.println("Enter the number of rows of matrix2");
        r2 = sc.nextInt();
        System.out.println("Enter the number of columns of matrix 2");
        c2 = sc.nextInt();

        if (c1 == r2) {

            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            int mul[][] = new int[r1][c2];

            System.out.println("Enter the elements of matrix 1");

            for (i = 0; i < r1; i++) {

                for (j = 0; j < c1; j++)
                    a[i][j] = sc.nextInt();

            }
            System.out.println("Enter the elements of matrix 2");

            for (i = 0; i < r2; i++) {

                for (j = 0; j < c2; j++)
                    b[i][j] = sc.nextInt();

            }

            System.out.println("\n\nOutput Matrix:-");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    sum = 0;
                    for (k = 0; k < r2; k++) {
                        sum += a[i][k] * b[k][j];

                    }
                    mul[i][j] = sum;
                }
            }

            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++)
                    System.out.print(mul[i][j] + " ");

                System.out.println();
            }
        } else
            System.out.print("multipication does not exist ");
    }

}