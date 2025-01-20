
public class Invoiceltem {
	
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public Invoiceltem(String id, String desc, int qty, double unitPrice) {
		
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public String getid() {
		return id;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getQty() {
		return qty;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getTotal() {
		return qty * unitPrice;
	}
	
	public String toString() {
		return "Invoiceltem[id =" + id + ",desc=" + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
	}
}
