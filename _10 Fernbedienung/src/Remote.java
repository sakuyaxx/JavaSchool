public class Remote {
    //Gedächtnisvariablen

    //private List<Battery> batteries;
    public String serialNumber;
    public String brandName;
    public String color;
    public String remoteSize;

    public Remote(String serialNumber, String brandName, String color, String remoteSize) {
        this.serialNumber = serialNumber;
        this.brandName = brandName;
        this.color = color;
        this.remoteSize = remoteSize;
    }
}
