import java.util.Scanner;

public class SumOfDig {
    public static void main(String args[]) {
        int num, d, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = sc.nextInt();
        while (num > 0) {
            d = num % 10;
            sum = sum + d;
            num = num / 10;
        }
        System.out.println("Sum of Digits:" + sum);
    }
}