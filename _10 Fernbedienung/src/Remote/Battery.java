package Remote;

public class Battery {
//    Eine Fernbedienung hat 2 Batterien
//    Jede Batterie merkt sich seinen Speicherstatus
//    Beim Aufruf der Methode getStatus() der Fernbedienung holt diese den Batteriestatus beider Batterien und berechnet den Mittelwert.
//    Sie liefert den Ladestatus zurück!
//
//    Bei turnOn() werden beide Batterien um 5% geschwächt. Jede Batterie meldet sich mit "Verbraucher angeschlossen"
//    Bei turnOff() melden beide Batterien "Kein Verbraucher angeschlossen"

    public String batteryType;
    public Double chargingStatus;

    public Battery(String batteryType, Double chargingStatus) {
        this.batteryType = batteryType;
        this.chargingStatus = chargingStatus;
    }

    public void turnOn(){
        this.chargingStatus -= 0.05;
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public String getBatteryType() {return batteryType;}
    public Double getChargingStatus() {return chargingStatus;}
    public void setChargingStatus(Double chargingStatus) {this.chargingStatus = chargingStatus;}
}
