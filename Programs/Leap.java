import java.time.Year;
import java.util.*;

class Leap {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + " Leap year");
        } else {
            System.out.println(year + " Not a leap year");

        }

    }

}