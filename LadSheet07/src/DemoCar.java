public class DemoCar {
    public static void main(String[] args) {

        Car car = new Car("Chevrolet" , "Cruze" , 2009 150000.0);

        System.out.println("Company Name: " + car.getCompanyName());
        System.out.println("Year:" + car.getYear());
        System.out.println("Mileage: + car.mileage());

        car.setCompanyName("toyota");
        car.setModelName("Corolla");
        car.setYear(2015);

        System.out.println("\nUpdated Car Details:");
        System.out.println("company Name: " + car.getCompanyName());
        System.out.println("Model Name: + car.getModelName());
        System.out.println("Year: " + car.getYear());

        car.setYear(1800);
        car.setModelName("");
    }
}