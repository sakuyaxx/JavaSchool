package Remote;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class Remote {
    //Gedächtnisvariablen

    private List<Battery> batteries;
    private int serialNumber;
    private String brandName;
    private Color color;
    private int remoteSize;
    private Boolean hasPower;
    public Remote(int serialNumber, String brandName, Color color, int remoteSize, Boolean hasPower) {
        this.serialNumber = serialNumber;
        this.brandName = brandName;
        this.color = color;
        this.remoteSize = remoteSize;
        this.hasPower = hasPower;
        this.batteries = new ArrayList<>();
    }

    public void addBattery(Battery battery) {
        this.batteries.add(battery);
    }
    public List<Battery> getBattery() {
        return batteries;
    }

    public void getStatus(){

    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public String getBrandName() {
        return brandName;
    }
    public Color getColor() {
        return color;
    }
    public int getRemoteSize() {
        return remoteSize;
    }
    public Boolean getHasPower() {return hasPower;}
}