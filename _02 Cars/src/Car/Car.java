package Car;

public class Car {
    //Gedächtnisvariablen

    private Engine engine;
    public Double fuelConsumption;
    public Double fuelAmount;
    public String serialNumber;
    public String brandName;
    public Double maxFuelAmount;

    public Car(Engine engine, Double fuelConsumption, String brandName, String serialNumber, Double maxFuelAmount){
        //Variablen am besten gleich nennen, wie die Gedächtnisvariablen
        // Jedoch nicht vergessen, dass das andere Variablen sind
        // --> lokale Variablen
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        this.brandName = brandName;
        this.serialNumber = serialNumber;
        this.maxFuelAmount = maxFuelAmount;
    }

    //Methoden
    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving and I have " + this.getEngine().getHorsePower() + " HP.");
    }

    public void brake() {
        System.out.println("Ich bremse");
    }

    public void turboBoost() {
        if (this.fuelAmount > (this.maxFuelAmount * 0.1)) {
            System.out.println("SuperBoostMode activated!");
        } else {
            System.out.println("You do not have enough fuel to go to SuperBoostMode... :(");
        }
    }
    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++){
            System.out.println("toot");
        }
    }

    public void getRemainingRange(){
        //Restreichweite des Autos
        double remainingRange = this.fuelAmount / this.fuelConsumption;
        System.out.println("Remaining range: " + remainingRange);
    }

    public Engine getEngine() {return engine;}
    public void setEngine(Engine engine) {this.engine = engine;}
    public Double getFuelConsumption() {return fuelConsumption;}
    public Double getFuelAmount() {return fuelAmount;}
    public void setFuelAmount(Double fuelAmount) {this.fuelAmount = fuelAmount;}
    public String getSerialNumber() {return serialNumber;}
    public String getBrandName() {return brandName;}
    public Double getMaxFuelAmount() {return maxFuelAmount;}

}
