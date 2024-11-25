import java.util.*;
import java.text.*; 
public class Javaexanple1 {

	public static void main(String[] args) {
		//define object for scanner class(input data from keyboard)
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat ("#,###.00");
		
		//สั่งแสดงชื่อินค้า
		System.out.print("Input product name: ");
		String productName = scan.nextLine();
		//สั่งแสดงและรับจำรวรสินค้า
		System.out.print("Input product unit");
		int productUnit = scan.nextInt();
		//สั่งแสดงและรับราคาสินค้า
		System.out.print("Input price per unit: ");
		float productPrice = scan.nextFloat();	
		
		System.out.println();
		System.out.println("Product name is :"+ productName);
		float totalPriceProduct = productUnit* productPrice;
		
		System.out.println("Total Price is "+ totalPriceProduct+" baht.");
		
		//คิด Vat 7%
		float totalVat = totalPriceProduct +(totalPriceProduct * 7/100);
		System.out.println("Add VAT 7% is "+ totalVat+"baht.");
		
		//Output using string.format and printf
		System.out.println("*****using printf and String.format*****");
		System.out.printf("Product name is : %$",productName);
		System.out.printf("Total price is %.21",totalPriceProduct);
		System.out.printf("Add VAT 7% is ",String.format("%,.2f",totalVat));
		System.out.printf("/nTotal price is%,.2f",totalProduct);
		System.out.printf("\nAdd VAT 7% is %5 baht.",String.format("%,.2f",total));
		scan.close();
	}

}
