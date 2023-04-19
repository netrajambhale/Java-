import java.util.*;
class AreaOfRhombus{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double a,b,area;
System.out.println("Enter Diagonals of Rhombus:");
a=sc.nextInt();
b=sc.nextInt();
area=0.5*a*b;
System.out.println("Area of Rhombus="+area);
}}