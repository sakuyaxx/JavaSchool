package Observer.System;
import Observer.Observer;
import SunCollector.SunCollector;

public abstract class ASystem implements Observer {

    @Override
    public void inform() {
        if (SunCollector.temp >= 18) {
            System.out.println("Die Spannung beträgt " + SunCollector.temp + "V.");
        }
    }
}
