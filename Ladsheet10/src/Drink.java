
public class Drink {
	protected int type;
	protected char size;
	
	public Drink(int type, char size) {
		this.type = type;
		this.size = size;
	}
	
	public Drink() {
		this.type = 0;
		this.size = 'S';
	}
	
	public String getTypeName() {
		switch (type) {
		case 1: return "Espresso";
		case 2: return "Americano";
		case 3: return "Latte";
		case 4: return "Cappuccino";
		case 5: return "Unknown";
		}
	}
	
	public char getSize() {
		return size;
	}
	
	public int getTotalPrice() {
		switch (size) {
		case 'S': return 50;
		case 'M': return 70;
		case 'L': return 90;
		default: return 0;
		}
	}

}
