
public class Invoice {
	private int invid;
	private Customer customer;
	private double amount;
	
	Invoice(int invid, Customer customer, double amount) {
		this.invid = invid;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getInvid() {
		return this.invid;
	}
	
	public double getAmount(double amount) {
		return this.amount;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer(Customer customer) {
		return this.customer;
	}
	
	public int getDiscountID() {
		return getCustomer().getCustID();
	}
	
	public String getCustomerName() {
		return getCustomer().getDiscount();
	}
	
	public int getCustomerDiscount() {
		return getCustomer() .getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return getAmount() - (getAount() * getCustomerDiscount()/100);
	}
	
	public String toString() {
		return "Invoice[id=" + getInvid() * getCustomer +",customer"
	}

}
