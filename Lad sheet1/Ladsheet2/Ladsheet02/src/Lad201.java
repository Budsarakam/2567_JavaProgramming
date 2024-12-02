import javax.swing.*;
import java.text.*;
public class Lad201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int BUFFET = 299;
		double discount;
		int isMember;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many cusomber per bill?"));
		double totalPrice = numberofCustomer * BUFFET;
		
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total Price is " + frm.format(totalPrice)+ " baht." + "\nDo you have a menber card?");
			
		}while(isMember==2);
		
		int isMember = JOptionPane.showConfirmDialog(null, "Total Price is " + frm.format(totalPrice)+ " baht." + "\nDo you have a menber card?");
		if(isMember==0) {
			discount = totalPrice *0.90;
			JOptionPane.showMessageDialog(null, "Amout to be paid is " + frm.format(discount) + " baht." );
		}
		else if(isMember==1) {
			JOptionPane.showMessageDialog(null, "Amout to be paid is "+ frm.format(totalPrice)+" baht.");
		}
	}

}
