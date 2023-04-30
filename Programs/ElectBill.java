import java.util.*;
class ElectBill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int unit,rate,a=0,b=0,c=0,d=0;

        System.out.println("Enter a units:");
        unit=sc.nextInt();
	  
        if(unit<100){
            a=10*unit;
        }
        else if(unit<200){
            b=(100*10)+(unit-100)*15;
        }
        else if(unit<300){
            c=(100*10)+(100*15)+(unit-200)*20;
        }
        else if(unit>300){
            d=(100*10)+(100*15)+(100*20)+(unit-300)*25;
        }
        rate=a+b+c+d;
        System.out.println("Total Bill="+rate);
    }
}