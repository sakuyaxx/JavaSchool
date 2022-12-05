package at.xxx.examples.cars;

public class Car {
    //Ein Auto hat eine Farbe, eine Maximalgeschwindigkeit, einen Basispreis, Basisverbrauch und einen Hersteller und einen Motor.
    // Der Hersteller hat einen Namen und ein Herkunftsland. Jeder Hersteller gibt einen gewissen Rabatt.
    // Dieser ist unterschiedlich je nach Hersteller. Der Rabatt wird in Prozent angegeben.
    // Der Motor ist entweder Diesel oder Benzin und hat eine Leistung.
    //Der Preis berechnet sich durch den Abzug des Rabatts vom Basispreis.
    //Der Benzinverbrauch entspricht die ersten 50.000km dem Basisverbrauch. Danach wird er um 9.8 Prozent höher.

    public String color;
    public Double maxVelocity;
    public Double basePrice;
    public Double baseConsumption;
    public String manufacturer;
    public Engine engine;


}
