import java.util.*;
class Avgmrks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0,avg;
        System.out.println("Enter a number of subjects:");
        n=sc.nextInt();
	  int a[]= new int [n];
        System.out.println("Enter "+n+" number of marks");
        for(i=0;i<a.length;i++){
	  	a[i]=sc.nextInt();
 	 	sum=sum+a[i];
	  }
	  avg=sum/n;
	  System.out.println("Average of marks="+avg);
    }
}