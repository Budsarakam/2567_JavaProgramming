public class Test Smartphone {
    public static void main(String[] args) {

        Smartphone phone = new Smartphone ("Samsung", "Galaxy S20",256);


        System.out.println("Initial Smartphone Details:");
        phone.printDetails();

        phone.addAdditionalStorage(300);
        phone.addAdditionalStorage(-50);
        phone.addAdditionalStorage(100);
        phone.printDetails();

        phone.setUsedStorage(600);
        phone.setUsedStorage(200);
        System.out.println("Used Storage: " + phone.getUsedStorage() +"GB");

        phone.setModel("A");
        phone.setModel("Galaxy Note");
        phone.printDetails();
}