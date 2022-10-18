package Car;

public class Car {
    //Gedächtnisvariablen
    private String color;
    public Double fuelConsumption;
    public Double fuelAmount;
    public String serialNumber;
    public String brandName;
    public Double maxFuelAmount;

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
        Double remainingRange = this.fuelAmount / this.fuelConsumption;
        System.out.println("Remaining range: " + remainingRange);
    }
}
