import java.util.Scanner;

public class nCrnPr {
   public static void main(String[] args) {
      int n, r, ncr, npr;
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the Value of n: ");
      n = sc.nextInt();
      System.out.print("Enter the Value of r: ");
      r = sc.nextInt();

      npr = (fact(n)) / (fact(n - r));
      ncr = npr / fact(r);

      System.out.println("\nnCr = " + ncr);
      System.out.println("nPr = " + npr);
   }

   public static int fact(int num) {
      int fact;
      fact = 1;
      for (int i = 1; i <= num; i++)
         fact = fact * i;
      return fact;
   }
}