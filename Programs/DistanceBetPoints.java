import java.util.*;
import java.lang.Math;

class DistanceBetPoints {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, dist;
        System.out.println("Enter 4 points:");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();

        dist = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("Distamce between two points=" + dist);
    }
}