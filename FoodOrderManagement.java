import java.util.Scanner;

public class FoodOrderManagement {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Food order ID");
		int id=sc.nextInt();
		System.out.println("Enter Food order Name");
		String name=sc.next();
		System.out.println("Enter the Price");
		int price=sc.nextInt();
		System.out.println("Enter quantity of the Food Order");
		int quantity=sc.nextInt();
		
		FoodOrder food=new FoodOrder(id,name,price,quantity);
		FoodOrder order=new FoodOrder(id,name,price,quantity);
		
		int choice;
		do {
			System.out.println("\n===Food Order Management===");
			System.out.println("1.Enter 1 to order one item");
			System.out.println("2.Enter 2 to order one item");
			System.out.println("3.Exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
	
			switch(choice) {
			case 1:
				food.displayFoodOrder();
				food.TotalBill();
				break;
			case 2:
				food.displayFoodOrder();
				food.TotalBill();
				order.displayFoodOrder();
				order.TotalBill();
			case 3:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid choice!Try again");
				
			}
		}while (choice!=3);
		
}
	}