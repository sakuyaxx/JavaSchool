package Car;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brandName = "Aston Martin";
        c1.fuelConsumption = 7.5;
        c1.serialNumber = "AM0001";

        Car c2 = new Car();
        c2.brandName = "Honda";
        c2.fuelConsumption = 3.3;
        c2.serialNumber = "H0001";

        System.out.println(c2.serialNumber + ", " + c2.fuelConsumption);
        System.out.println(c1.brandName);
    }
}