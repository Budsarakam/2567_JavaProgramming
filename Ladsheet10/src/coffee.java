public class Coffee extends Drink {
    private int typeCoffee;
    private char sizeCoffee;
    private Barista barista;

    public Coffee (int type, char size, int typeCoffee, charsizeCoffee, Barista barista) {
        super(type, size);
        this.typeCoffee = typeCoffee;
        this.SizeCoffee = sizeCoffee;
        this.barista = barista;
    }

    public String getTypeCoffeeName() {
        return super.getTypeName();
    }

    public char getSizeCoffee() {
        return sizeCoffee;
    }

    public String getBaristaName() {
        return barista.getName();
    }

    public int getSizePrice() {
        return super.getTotalPrice();
    }

    public int getTotalPrice() {
        return getSizePrice();
    }

    @Override
    public String toString(){
        return String.format("Coffee: %s (%c) made by %s \n Price: %d Baht", getTypeCoffeeName(), getSizeCoffee(),getBaristaName(),getTotalPrice());
    }
}