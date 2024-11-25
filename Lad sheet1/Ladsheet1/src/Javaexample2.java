import javax.swing.*;
public class Javaexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name:");
		String productUniStr =JOptionPane.showInputDialog("Input Product Unit:");
		int productUnit = Integer.parseInt(productUniStr);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit"));
		
		double totalPrice = productPrice * productUnit;
		
		String frmTotalPrice = String.format("%,.2f", totalPrice);
		String frmTotalVat = String.format("%,.2f", totalVat);
		
		JOptionPane.showMessageDialog(null, "Total Price is "+totalPrice + "baht."
				+ "\nAdd VAT 7% is "+frmTotalVat+" baht.");

	}

}
