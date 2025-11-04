package controlstatements;
import java.util.Scanner;
public class CinemaDiscount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
	    int age=sc.nextInt();
		System.out.println("Enter the day of booking 1 for weekdays and 2 for saturday and sunday");
		int booking=sc.nextInt();
		int ticket_price=200;
	    if(booking==1) {
	    	if(age<5) {
	    		System.out.println("Free Ticket");
	    		}
	    	else if(age>=5 && age<=18) {
	    	    int discount=ticket_price*50/100;
	    		System.out.println("Ticket price="+discount);
	    	}
	    	else if(age>=19 && age<=60) {
	    		System.out.println("Ticket price="+ticket_price);
	       }
	    	else {
	    		int discount=ticket_price*40/100;
	    		System.out.println("Ticket price="+discount);
	    	}
	        }
	    else if(booking==2) {
	    	if(age<5) {
	    		System.out.println("Free Ticket");
	    		}
	    	else if(age>=5 && age<=18) {
	    		int discount=ticket_price*40/100;
	    		System.out.println("Ticket price="+discount);
	    	}
	    	else if(age>=19 && age<=60) {
	    		System.out.println("Ticket price="+ticket_price);
	       }
	    	else {
	    	    int discount=ticket_price*30/100;
	    		System.out.println("Ticket price="+discount);
	    	}
	    }
	    else {
	        	System.out.println("Enter valid option");
	    }    	
	    }
}
