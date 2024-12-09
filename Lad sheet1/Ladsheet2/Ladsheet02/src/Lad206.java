import javax.swing.JOptionPane;

public class Icecream {
    public satic void main(String[] args) {
        final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;

        String[] flavors = {"1. Vanilla","2. chocolate"};
        String inputFlavor =
    JOptionPane.showInputDialog(null,"Choose your flavor:\n1. Vanilla\n2.Chocolate");

        int flavorCost = 0;
        if (inputFlavor != null) {
            switch (inputFlavor) {
                caase "1":
                    flavorCost = VANILLA;
                    break;
                case "2":
                    flavorCost = CHOCOLATE;
                    break;
                default:
                  JOptionPane.showMessageeDilog(null,"ERROR: Wrong choice! Try again.");
                  System.exit(o);
            }
        }else {
            System.exit(0);
        }

        int addTooping =JOptionPane.showConfirmDialog(null,"Do you want to add Topping? (+$" + TOPPING +")","Topping Option",
        JOptionPane.YES_NO_OPTION);

        int totalCost = flavorCost + (addTooping == JOptionPane.YES_NO_OPTION ? TOPPING : 0);

        JOptionPane.showMessageeDilog(null,"Your order:\nFlavor Cost: $" + flavorCost + "\nTopping: "(addTooping == JOptionPane.YES_NO_OPTION? "Yee" : "No")+
        "\nTotal: $" + totalCost);
        }
    }
}