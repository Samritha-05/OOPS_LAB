package def;
import java.util.Scanner;
public class EvenOdd {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            int[] originalArray = new int[10];
	        int[] oddArray = new int[10];
	        int[] evenArray = new int[10];

	        System.out.println("Enter 10 integer numbers:");

	        for (int i = 0; i < 10; i++) {
	            originalArray[i] = sc.nextInt();

	            if (originalArray[i] % 2 == 0) {
	                evenArray[i] = originalArray[i] * originalArray[i] * originalArray[i];
	               
	            } else {
	                oddArray[i] = originalArray[i] * originalArray[i];
	             
	            }
	        }
	        System.out.print("Original Array: ");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(originalArray[i] + " ");
	        }

	        System.out.print("\nOdd Array : ");
	        for (int i = 0; i < 10; i++) {
	        	if (oddArray[i] != 0) {
	            System.out.print(oddArray[i] + " ");
	        }}

	        System.out.print("\nEven Array: ");
	        for (int i = 0; i < 10; i++) {
	            System.out.print(evenArray[i] + " ");
	        }}}

	    
