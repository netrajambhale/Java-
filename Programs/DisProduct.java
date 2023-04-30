import java.util.*;

class DisProduct {
    public static void main(String[] args) {
        float totalcost, costtopay, discount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total Amount of Product: ");
        totalcost = sc.nextFloat();
        if (totalcost <= 800) {
            costtopay = totalcost;
        } else if (totalcost > 800 && totalcost <= 1500) {
            discount = (totalcost * 10) / 100;
            costtopay = totalcost - discount;
        } else if (totalcost > 1500 && totalcost <= 2500) {
            discount = (totalcost * 15) / 100;
            costtopay = totalcost - discount;
        } else if (totalcost > 2500 && totalcost <= 5000) {
            discount = (totalcost * 20) / 100;
            costtopay = totalcost - discount;
        } else {
            discount = (totalcost * 30) / 100;
            costtopay = totalcost - discount;
        }
        System.out.println("\nThe cost to Pay is: " + costtopay);
    }
}