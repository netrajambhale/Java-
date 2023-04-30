public class CompoundInt {
    public static void main(String args[]) {
        double principle, rate, time, interest;
        principle = 100000;
        rate = 5;
        time = 3;
        System.out.println("Principle= " + principle);
        System.out.println("rate= " + rate);
        System.out.println("time= " + time);

        interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
        System.out.println("\nThe Compound Interest is: " + interest);
    }
}