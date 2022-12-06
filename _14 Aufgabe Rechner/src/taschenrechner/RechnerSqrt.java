package taschenrechner;

public class RechnerSqrt extends Rechner {
    public static void SquareRoot(Double numOne) {
        double result = Math.sqrt(numOne);
        System.out.println("√" + numOne + " = " + result);
    }
}
