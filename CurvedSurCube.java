import java.util.*;
class CurvedSurCube{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double l,h,b,area;
        System.out.println("Enter length, breadth and height of Cube:");
        l=sc.nextInt();
        h=sc.nextInt();
        b=sc.nextInt();
        area=2*(l*h+h*b);
        System.out.println("Curved surface area of cube="+area);
}
}