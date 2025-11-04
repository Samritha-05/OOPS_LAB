package controlstatements;
import java.util.Scanner;
public class ElectricityUnits {

	    public static void main(String[] args) {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the electricity units for 12 months");
	        int m1=sc.nextInt();
	        int m2=sc.nextInt();
	        int m3=sc.nextInt();
	        int m4=sc.nextInt();
	        int m5=sc.nextInt();
	        int m6=sc.nextInt();
	        int m7=sc.nextInt();
	        int m8=sc.nextInt();
	        int m9=sc.nextInt();
	        int m10=sc.nextInt();
	        int m11=sc.nextInt();
	        int m12=sc.nextInt();
	        
	        int total_units=m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+m12;
	       
	        double average_units=total_units/12.0;
	        
	        System.out.println("\nTotal units consumed in 12 months: " + total_units);
	        System.out.println("Average monthly usage:"+average_units + "units");

	        if(average_units>500) {
	        System.out.println("High Consumption Alert!");
	        }
	        
	    }}

	 