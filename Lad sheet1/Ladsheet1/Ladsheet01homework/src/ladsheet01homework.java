import javax.swing.JOptionPane;
public class ladsheet01homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class SalaryCalculator {
		    public static void main(String[] args) {
		        // รับชื่อพนักงาน
		        String employeeName = JOptionPane.showInputDialog("กรุณากรอกชื่อพนักงาน:");

		        // รับเงินเดือนขั้นต้น
		        String baseSalaryStr = JOptionPane.showInputDialog("กรุณากรอกเงินเดือนขั้นต้น:");
		        double baseSalary = Double.parseDouble(baseSalaryStr);

		        // รับค่าลดหย่อนภาษี
		        String taxDeductionStr = JOptionPane.showInputDialog("กรุณากรอกค่าลดหย่อนภาษี:");
		        double taxDeduction = Double.parseDouble(taxDeductionStr);

		        // รับค่าประกันสังคม
		        String socialInsuranceStr = JOptionPane.showInputDialog("กรุณากรอกค่าประกันสังคม:");
		        double socialInsurance = Double.parseDouble(socialInsuranceStr);

		        // คำนวณเงินเดือนสุทธิ
		        double taxRate = 0.1; // สมมติว่าอัตราภาษีเป็น 10%
		        double tax = baseSalary * taxRate;
		        double netSalary = baseSalary - tax - taxDeduction - socialInsurance;

		        // แสดงผลลัพธ์
		        String result = "ชื่อพนักงาน: " + employeeName + "\n" +
		                        "เงินเดือนขั้นต้น: " + baseSalary + "\n" +
		                        "ค่าลดหย่อนภาษี: " + taxDeduction + "\n" +
		                        "ค่าประกันสังคม: " + socialInsurance + "\n" +
		                        "เงินเดือนสุทธิ: " + netSalary;

		        JOptionPane.showMessageDialog(null, result);
		    }
		}
	}

}
