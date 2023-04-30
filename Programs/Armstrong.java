import java.util.*;

class Armstrong {
    public static void main(String[] args) {
        int Sum = 0, num, digit, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        num = sc.nextInt();
        temp = num;
        while (num > 0) {
            digit = num % 10;
            Sum = Sum + (digit * digit * digit);
            num = num / 10;
        }
        if (temp == Sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
