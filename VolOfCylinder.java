import java.util.*;
class VolOfCylinder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r,h,volume;
        System.out.println("Enter radius and height of cylinder:");
        r=sc.nextInt();
        h=sc.nextInt();
        volume=3.14*r*r*h;
        System.out.println("Volume of cylinder="+volume);
}
}