import java.util.*;
class PeriOfRect{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double l,w,perimeter;
System.out.println("Enter length and width of Rectangle:");
l=sc.nextInt();
w=sc.nextInt();

perimeter=2*(l+w);
System.out.println("Perimeter of Rectangle="+perimeter);
}}