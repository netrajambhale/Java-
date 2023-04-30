import java.util.*;
class Fact{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,fact=1,i;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial="+fact);
    }
}