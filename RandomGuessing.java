package controlstatements;
import java.util.Scanner;
import java.util.Random;
public class RandomGuessing {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        int number=rand.nextInt(100)+1;
	        
	        System.out.println("Welcome to Number Guessing Game");
	        int attempts=0;
	        
	        
	        while(true) {
	        	 System.out.println("Enter your guess between 1 to 100: ");
	        	 int guess=sc.nextInt();
	        	 attempts++;
	        	
	        	if(guess>number) {
	        		System.out.println("Too High!Try Again!");
	        	}
	        	else if(guess<number) {
		            System.out.println("Too low!Try Again!");
	        	}
	        	else {
	        		System.out.println("Congrats! You have guessed it in " + attempts + " attempts");
	        		break;
	        	}
	        }}}
	        
	        
	        
	        
	        
	        
	        
	        
	  
	  


