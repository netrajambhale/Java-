import java.util.*;

class CalCommission {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		double amount, commissionper, commission;
		System.out.print("Enter Amount:");
		amount = sc.nextDouble();
		System.out.print("Enter Commission Percentage:");
		commissionper = sc.nextDouble();
		commission = (commissionper / 100) * amount;
		System.out.println("Commission amount=" + commission);

	}
}
