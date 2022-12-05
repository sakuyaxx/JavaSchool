package at.xxx.examples.cars;

public class Main {
    public static void main(String[] args) {
        Manufacturer M1 = new Manufacturer("Porsche", "Germany", 0.15);

        Engine E1 = new Engine("Benzin", 250.0);

        Car C1 = new Car("purple", 250.69, 50.0, 8.5, M1, E1, 50001.0);

        C1.getFinalPrice();
        C1.getFuelConsumption();
    }
}
