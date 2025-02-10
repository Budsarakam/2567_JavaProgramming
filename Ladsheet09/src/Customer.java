
public class Customer {

	private int id;
	private String name;
	private int discount;
	
	Customer (int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	
	public int getCID() {
		return this.cid;
	}
	
	public String getCustName() {
		return this.name;
	}
	
	public int getDiscount() {
		this.discount = discount;
	}
	
	public String toString() {
		return getCustName() + "(" + getCustID() + ") (" + getDiscount() + "%)";
	}
	
		
		

	}

}
