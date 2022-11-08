package Car;

public class Tyre {
    private Double diameter; //Durchmesser
    private Double grip; //0.01 << 1.00
    private String manufacturer; //Hersteller
    private int position;

    public Tyre(Double diameter, Double grip, String manufacturer, int position) {
        this.diameter = diameter;
        this.grip = grip;
        this.manufacturer = manufacturer;
        this.position = position;
    }

    public Double getDiameter() {
        return diameter;
    }

    public Double getGrip() {
        return grip;
    }

    public void setGrip(Double grip) {
        this.grip = grip;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
