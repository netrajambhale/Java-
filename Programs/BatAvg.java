import java.lang.*;
import java.util.*;

public class BatAvg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int innings, not_out, runs;
        double avg;
        System.out.println("Enter a number of innings and number not out innings:");
        innings = sc.nextInt();
        not_out = sc.nextInt();

        System.out.println("Enter runs of batsman: ");
        runs = sc.nextInt();

        if (innings == not_out)
            avg = runs;
        else
            avg = runs / (innings - not_out);

        System.out.println("Batting average=" + avg);
    }
}
