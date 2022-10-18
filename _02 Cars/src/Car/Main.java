package Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brandName = "Aston Martin";
        c1.fuelConsumption = 7.5;
        c1.serialNumber = "AM0001";
        c1.maxFuelAmount = 120.0;
        c1.fuelAmount = 70.0;

        Car c2 = new Car();
        c2.brandName = "Honda";
        c2.fuelConsumption = 3.3;
        c2.serialNumber = "H0001";
        c2.maxFuelAmount = 150.0;
        c2.fuelAmount = 20.0;

        /*System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);*/

        c1.brake();

        c2.turboBoost();

        c2.honk(13);

        c1.getRemainingRange();

    }
}