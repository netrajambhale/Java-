import java.util.*;
class VolOfSphere{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double r,volume;
        System.out.println("Enter radius of Sphere:");
        r=sc.nextInt();
        volume=(4*3.14*r*r*r)/3;
        System.out.println("Volume of Sphere="+volume);
}
}