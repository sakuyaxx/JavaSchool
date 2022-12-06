package car;

public class Main {
    public static void main(String[] args) {
       Truck T1 = new Truck("Dodge", 2568879, "black", "Trailer1");

        System.out.println(T1.getBrand() + ", " +  T1.getTrailer());

        T1.drive(); //Methode von Truck wird genommen (NICHT von Car) wegen Override
        T1.brake();
    }
}