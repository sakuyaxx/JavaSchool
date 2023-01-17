import java.time.LocalDate;

public abstract class ADog implements Dog{
    public String name;
    public LocalDate dob;
    public BarkStrategy strategy;

    public ADog(String name, BarkStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    @Override
    public void run() {

    }
}
