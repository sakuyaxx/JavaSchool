import Observer.System.ASystem;
import Observer.System.Heizung;
import SunCollector.SunCollector;

public class Main {
    public static void main(String[] args) {
        SunCollector s1 = new SunCollector();

        s1.curVolt();

        Heizung h1 = new Heizung();

        h1.inform();
    }
}