import java.util.Scanner;

public class FoodOrder {
  private int OrderId;
  private String FoodOrderName;
  private int price;
  private int quantity;
  
  public FoodOrder(int OrderId,String FoodOrderName, int price,int quantity) {
	  this.OrderId=OrderId;
	  this.FoodOrderName=FoodOrderName;
	  this.price=price;
	  this.quantity=quantity;
  }
  public void price(int newprice) {
	  this.price=newprice;
	  System.out.println("Price updated:"+ price);  
	  }
  
	  
	  
 
 
  public void TotalBill() {
	  quantity++;
	  int Total=(price*quantity)+50;
	  System.out.println("The Total Bill For The Food Order Is:"+Total);
	  
  }
  
  public void displayFoodOrder() {
	  System.out.println("====Food Order Details====");
	  System.out.println("Order ID= "+OrderId);
	  System.out.println("Food Order Name="+FoodOrderName);
	  System.out.println("Order Price= Rs." +price);
	  System.out.println("Food quantity=" +quantity);
  }
		  
  }

