public class CGPA {
    public static void main(String args[]) {
        double English, Hindi, Maths, Science, Marathi, avg, CGPAper;
        English = 9.1;
        Hindi = 8.5;
        Maths = 9.5;
        Science = 9.6;
        Marathi = 8.6;
        avg = (9.1 + 8.5 + 9.5 + 9.6 + 8.6) / (5.0);
        CGPAper = 9.5 * (avg);
        System.out.println(" CGPA Percentage is:  " + CGPAper);
    }
}