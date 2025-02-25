import javax.swing.JOptionPane;

public class Lab402 {

    public static void main(String[] args) {
        // รับค่าปีจากผู้ใช้
        String input = JOptionPane.showInputDialog("Input year:");
        int year = Integer.parseInt(input);

        // ตรวจสอบว่าปีอยู่ในช่วงที่กำหนดหรือไม่
        if (checkYear(year)) {
            // ตรวจสอบว่าปีเป็นปีอธิกสุรทินหรือไม่
            if (isLeapYear(year)) {
                JOptionPane.showMessageDialog(null, year + " is Leap year.");
            } else {
                JOptionPane.showMessageDialog(null, year + " is NOT Leap year.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Year is out of range (1000 - 3000).");
        }
    }

    public static boolean isLeapYear(int year) {
        // ตรวจสอบเงื่อนไขปีอธิกสุรทิน
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static boolean checkYear(int year) {
        // ตรวจสอบว่าปีอยู่ในช่วง 1000 - 3000
        return year >= 1000 && year <= 3000;
    }
}