package Car;

public class Car {
    //Gedächtnisvariablen
    private String color;
    public Double fuelConsumption;
    public Double fuelAmount;
    public String serialNumber;
    public String brandName;
    public Double maxFuelAmount;

    public Car(Double fuelConsumption, String brandName, String serialNumber){
        //Variablen am besten gleich nennen, wie die Gedächtnisvariablen
        // Jedoch nicht vergessen, dass das andere Variablen sind
        // --> lokale Variablen
        this.fuelConsumption = fuelConsumption;
        this.brandName = brandName;
        this.serialNumber = serialNumber;
    }

    //Mehoden
    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
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
}
