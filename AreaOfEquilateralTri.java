import java.util.*;
import java.lang.Math;
class AreaOfEquilateralTri{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double a,b,area;
System.out.println("Enter Length of sides of triangle:");
a=sc.nextInt();

b=Math.sqrt(3);
area=b/4*a*a;
System.out.println("Area of Equilateral Triangle="+area);
}}