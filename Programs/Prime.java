import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        int i, num, count = 0;
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                count = 0;
                break;
            } else {
                count = 1;
            }
        }
        if (count == 1) {
            System.out.println("" + num + " is a prime number.");
        } else {
            System.out.println("" + num + " is not a prime number.");
        }
    }
}