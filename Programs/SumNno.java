import java.util.*;
class SumNno{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter a number of integers:");
        n=sc.nextInt();
	  int a[]= new int [n];
        System.out.println("Enter "+n+" number ");
        for(i=0;i<a.length;i++){
	  	a[i]=sc.nextInt();
 	 	sum=sum+a[i];
	  }
	  System.out.println("Sum ="+sum);
    }
}