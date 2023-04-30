import java.lang.*;
import java.util.*;
public class Average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0,avg;
        System.out.println("Enter a number of integers:");
        n=sc.nextInt();
	  int a[]= new int [n];
        System.out.println("Enter "+n+" number");
        for(i=0;i<a.length;i++){
	  	a[i]=sc.nextInt();
 	 	sum=sum+a[i];
	  }
	  avg=sum/n;
	  System.out.println("Average="+avg);
    }
}