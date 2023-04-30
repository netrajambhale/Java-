import java.util.*;

class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, power, val = 1;
        System.out.println("Enter base and power: ");
        base = sc.nextInt();
        power = sc.nextInt();
        while (power != 0) {
            val = val * base;
            power--;
        }
        System.out.println("Value=" + val);
    }
}