import java.util.*;
class PeriOfIsoscelesTri{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double a,b,perimeter;
System.out.println("Enter length and width of Isosceles Triangle:");
a=sc.nextInt();
b=sc.nextInt();

perimeter=2*a+b;
System.out.println("Perimeter of Isosceles Triangle="+perimeter);
}}