
public class TestProduct {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);


			System.out.print("Enter product name: ");

			String name = scanner.nextLine();


			System.out.print("Enter product price: ");

			double price = scanner.nexDouble();


			System.out.print("Enter VAT rate (%): ");

			Double vatRate = scanner.nextDouble();


			Product product = new Product();

			product.setProductDetails(name, price, vatRate);


			product.displayProductDetails();


			Scanner.close();

			}

			}

	}

}
