import java.util.Scanner;

public class VowelCons {
    public static void main(String args[]) {
        char ch;
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        ch = sc.next();
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ' || ch == 'A' || ch == 'E'
                || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}