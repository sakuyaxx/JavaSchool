package Lamp;

public class Main {
    public static void main(String[] args) {
        LightElements LE1 = new LightElements("Kade", "red",25.0, false);
        LightElements LE2 = new LightElements("Crystal", "blue",15.0, true);
        LightElements LE3 = new LightElements("Gigi", "orange",30.0, false);
        //LE1.turnOn();
        //LE2.turnOn();
        //LE3.turnOn();

        Lamps L1 = new Lamps(9,"Sony");

        L1.addLightElement(LE1);
        L1.addLightElement(LE2);
        L1.addLightElement(LE3);

        L1.printNamesOfLightElements();
        L1.getOverallPowerUsage();
        L1.turnAllOn();
    }
}
