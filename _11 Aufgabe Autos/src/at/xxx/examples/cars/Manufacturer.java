package at.xxx.examples.cars;

public class Manufacturer {

    public String bezeichnung;
    public String country;
    public Double discount;

    public Manufacturer(String bezeichnung, String country, Double discount) {
        this.bezeichnung = bezeichnung;
        this.country = country;
        this.discount = discount;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Double getDiscount() {
        return discount;
    }
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
