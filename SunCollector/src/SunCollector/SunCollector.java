package SunCollector;
import java.lang.reflect.Array;

public class SunCollector {

   public int minVolt = 0;
   public int maxVolt = 19;
   public int currentVolt = (int) (Math.random() * (maxVolt - minVolt));
   public static int temp;

    public void curVolt(){
        System.out.println("Die momentane Spannung beträgt " + currentVolt + "V.");
        temp = currentVolt;
    }

    public void produce(){
    }

}
