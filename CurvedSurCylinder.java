import java.util.*;
class CurvedSurCylinder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r,h,area;
        System.out.println("Enter radius and height of Cylinder:");
        r=sc.nextInt();
        h=sc.nextInt();
        area=2*3.14*r*h;
        System.out.println("Curved surface area of cylinder="+area);
}
}