package Car;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    public int horsePower;
    private TYPE type; //Diesel oder Benzin

    public Engine(int horsePower, TYPE type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    //amount has to be a value between 1 and 100
    public void drive(int speed){
    System.out.println("the motor is running with " + speed + " km/h.");

    if(speed < 20){
        System.out.println("The car is running pretty slow.");
    }
    else if (speed < 40){
        System.out.println("You could be quicker!");
    }
    else if(speed < 60){
        System.out.println("We're getting there...");
    }
    else if(speed < 80){
        System.out.println("You're pretty fast already.");
    }
    else if(speed < 100) {
        System.out.println("Wow, you are so quick!");
    }
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }
}
