package Lamp;

public class LightElements {
    public String leName;
    public String color;
    public Double powerConsumption;
    public Boolean status;

    public LightElements(String leName, String color, Double powerConsumption, Boolean status) {
        this.leName = leName;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.status = status;
    }

    public void turnOn(){
        if (status){
            System.out.println("Mein Name ist " + this.leName + "." + " Ich bin bereits eingeschaltet.");
            this.powerConsumption += 5;
        }
        else {
            status = true;
            this.powerConsumption += 5;
            System.out.println(this.powerConsumption);
        }
    }


    public String getLeName() {
        return leName;
    }

    public void setLeName(String leName) {
        this.leName = leName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPowerConsumption() {
        return powerConsumption;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
