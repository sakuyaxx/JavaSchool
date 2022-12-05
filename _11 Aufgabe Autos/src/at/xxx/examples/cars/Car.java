package at.xxx.examples.cars;

public class Car {
    public String color;
    public Double maxVelocity;
    public Double basePrice;
    public Double baseConsumption;
    public Manufacturer manufacturer;
    public Engine engine;
    public Double distanceDriven;

    public Car(String color, Double maxVelocity, Double basePrice, Double baseConsumption, Manufacturer manufacturer, Engine engine, Double distanceDriven) {
        this.color = color;
        this.maxVelocity = maxVelocity;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.distanceDriven = distanceDriven;
    }

    public void getFinalPrice(){
        Double finalPrice = this.basePrice - (this.basePrice * this.manufacturer.discount);
        System.out.println(finalPrice + "€");
    }

    public void getFuelConsumption(){
        if (distanceDriven >= 50000){
            this.baseConsumption = this.baseConsumption + (this.baseConsumption * 0.098);
            System.out.println("You've driven more than 50.000 km! Your fuel consumption will go up to " + this.baseConsumption + " liters.");
        }
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public Double getMaxVelocity() {return maxVelocity;}
    public Double getBasePrice() {return basePrice;}
    public Double getBaseConsumption() {return baseConsumption;}
    public Manufacturer getManufacturer() {return manufacturer;}
    public Engine getEngine() {return engine;}

}
