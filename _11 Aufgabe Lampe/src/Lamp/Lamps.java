package Lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamps {

    public int size;
    public String brand;
    public List<LightElements> lightElements;

    public Lamps(int size, String brand) {
        this.size = size;
        this.brand = brand;
        this.lightElements = new ArrayList<>();
    }

    public void addLightElement(LightElements lightElements) {
        this.lightElements.add(lightElements);
    }

    public void printNamesOfLightElements(){
        for (int i = 0; i < lightElements.toArray().length; i++) {
            System.out.println(this.getLightElements().get(i).getLeName());
        }
    }

    public void turnAllOn(){
        for (int i = 0; i < lightElements.toArray().length; i++) {
           this.getLightElements().get(i).status = true;
           this.getLightElements().get(i).powerConsumption += 5;
           System.out.println( this.getLightElements().get(i).status + ", " + getLightElements().get(i).powerConsumption);
        }
        System.out.println("Turned on all lights");
    }

    public void getOverallPowerUsage(){
        double sum = 0.0;
        for (int i = 0; i < lightElements.toArray().length; i++) {
            sum += this.getLightElements().get(i).getPowerConsumption();
        }
        System.out.println(sum);
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public List<LightElements> getLightElements() {
        return lightElements;
    }
}
