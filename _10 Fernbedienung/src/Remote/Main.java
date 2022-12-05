package Remote;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Remote R1 = new Remote(273355, "LG", Color.ORANGE, 5, true);

        Battery B1 = new Battery("AAA",1.00);
        Battery B2 = new Battery("AAA",1.00);

        R1.addBattery(B1);
        R1.addBattery(B2);

        //R1.getStatus();


        //System.out.println(R1.getBattery().get(1).getChargingStatus());
    }
}