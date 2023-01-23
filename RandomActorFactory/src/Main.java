import game.Actor;
import game.RandomActorFactory;
import game.actors.AActors;
import game.actors.bee;

public class Main {
    public static void main(String[] args) {
       var actors = RandomActorFactory.getActors(20);

        for (AActors actor : actors) {
            actor.sayHello();
        }

    }
}