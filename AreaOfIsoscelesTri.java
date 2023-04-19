import java.util.*;
import java.lang.Math;
class AreaOfIsoscelesTri{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double a,b,h,area;
System.out.println("Enter Length of two sides and base of triangle:");
a=sc.nextInt();
b=sc.nextInt();
h=Math.sqrt((a*a)-(b*b/4));
area=0.5*b*h;
System.out.println("Area of Isosceles triangle="+area);
}}