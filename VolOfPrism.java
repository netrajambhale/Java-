import java.util.*;
class VolOfPrism{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double l,w,h,volume;
        System.out.println("Enter length, width and height of prism:");
        l=sc.nextInt();
        w=sc.nextInt();
        h=sc.nextInt();
        volume=l*w*h;
        System.out.println("Volume of prism="+volume);
}
}