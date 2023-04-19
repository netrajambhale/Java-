import java.util.*;
class VolOfCone{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double r,h,volume;
System.out.println("Enter radius and height of cone:");
r=sc.nextInt();
h=sc.nextInt();
volume=3.14*r*r*h/3;
System.out.println("Volume of cone="+volume);
}}