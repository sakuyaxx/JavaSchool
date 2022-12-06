package car;

public class Car {

    //car.Truck und Race car: is-a-Beziehung
    //car.Truck und Race car können alles was car.Car kann, aber bisschen mehr
    public String brand;
    public int serialNumber;
    public String color;

    public Engine engine;

    public Car(String brand, int serialNumber, String color) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public void drive(){
        System.out.println("vroom vroom");
    }

    public void brake(){
        System.out.println("I am braking");
    }

    public String getBrand() {
        return brand;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }
}
