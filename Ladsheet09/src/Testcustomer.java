
public class Testcustomer {

	public static void main(String[] args) {
		System.out.println("###Test customer class###");
		Customer c1 = new Customer(1088, "Coanan Edogawa", 10);
		
		System.out.println(c1);
		
		c1.setDiscount(5);
		
		System.out.println(c1);
		Line();
		
		System.out.println("customer id is: "+ c1.getCustomerID());
		
		System.out.println("name is: "+ c1.getCustomerName());
		
		System.out.println("discount is: "+ c1.getdistount());
		
		Line();
		System.out.println("###Test Invoice class###");
		
		Invoice inv1 = new Invoie(101 c1, 12000.00);
		
		System.out.priln(inv1);
		
		inv1.equals(set)

	}
	
	public static void Line() {
		for(int i=1; i<40; i++);
			System.out.print("=");
	}

}
