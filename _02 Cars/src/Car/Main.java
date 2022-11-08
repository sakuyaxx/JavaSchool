package Car;

public class Main {
    public static void main(String[] args) {

        Engine E1 = new Engine(140, Engine.TYPE.DIESEL);
        Engine E2 = new Engine(520, Engine.TYPE.GAS);
        Engine E3 = new Engine(200, Engine.TYPE.DIESEL);

        RearMirror rm1 = new RearMirror(100,0);
        RearMirror rm2 = new RearMirror(90,-50);

        Car c1 = new Car(E1,7.5, "Aston Martin", "AM001", 120.0);
        c1.fuelAmount = 70.0;
        c1.addMirror(rm1);
        c1.addMirror(rm2);

        Car c2 = new Car(E2,3.3, "Honda", "H0001", 150.0);
        c2.fuelAmount = 20.0;

        /* System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount); */

        /* c1.brake();
        c2.turboBoost();
        c2.honk(13);
        c1.getRemainingRange(); */

        Car c3 = new Car(E3, 7.69, "Opel", "OP001", 135.5);
        c3.fuelAmount = 85.3;

        // System.out.println(c3.fuelConsumption + c2.fuelConsumption + c1.fuelConsumption);
        // E1.drive(69);

        System.out.println(c1.getMirrors().get(0).getPosition());
    }
}