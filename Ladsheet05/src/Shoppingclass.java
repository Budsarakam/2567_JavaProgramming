
public class Shoppingclass {

	public static void main(String[] args) {
		
		displayItemsAndTotal("Apple",10.5, "Banana",5.75, "Organge",7.3);
		displayItemsAndTotal("Milk",20.0, "Bread",15.00);
		displayItemsAndTotal();

	}

	public static void displayItemsAndTotal(Object... items) {
		if(items.length == 0) {
			System.out.println("No Item in the cart.");
			return;
		}
		double totalPrice = 0.0;
		System.out.println("Item in the cart:");
		for(int i=0;i<items.length;i+=2) {
			String itemName = (String)items[i];
			double itemPrice = (double)items[i+1];
			
			System.out.printf("- %s: $%.2f%n", itemName, itemPrice);
			System.out.println();
		}
		
	}
	}