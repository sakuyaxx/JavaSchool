package car;

public class Truck extends Car {

    public String trailer;

    public Truck(String brand, int serialNumber, String color, String trailer) {
        super(brand, serialNumber, color);
        this.trailer = trailer;
    }

    @Override
    public void drive() {
        System.out.println("I am driving the truck --> consumption is higher");
        //super.drive();
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}