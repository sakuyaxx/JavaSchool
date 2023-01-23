package game.actors;
import game.Actor;

public abstract class AActors implements Actor {
    public String actorName;
    public String type;

    public AActors(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public void sayHello() {
        System.out.println("Name: " + actorName + " | " + "Type: " + type);
    }
}
