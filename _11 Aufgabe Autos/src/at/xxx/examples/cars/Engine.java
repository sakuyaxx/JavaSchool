package at.xxx.examples.cars;

public class Engine {
    public String typeOfEngine;
    public Double horsePower;

    public Engine(String typeOfEngine, Double horsePower) {
        this.typeOfEngine = typeOfEngine;
        this.horsePower = horsePower;
    }

    public String getTypeOfEngine() {return typeOfEngine;}
    public Double getHorsePower() {return horsePower;}
}
