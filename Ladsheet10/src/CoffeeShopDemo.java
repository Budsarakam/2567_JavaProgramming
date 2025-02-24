public class CoffeeShopDemo {
    public static void main (String[] args) {
        Barista barista = new Barista ("Alice",'F');
        Coffee coffee = new Coffee (3, 'M','M', barista);

        System.out.println(coffee.toString());
    }
}