import java.util.*;
class AreaOfTriangle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double b,h,area;
System.out.println("Enter Base and Height of Triangle:");
b=sc.nextInt();
h=sc.nextInt();

area=0.5*b*h;
System.out.println("Area of Triangle="+area);
}}