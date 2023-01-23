package game;


import game.actors.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomActorFactory {

    public static List<AActors> getActors(int count){
        Random random = new Random();
        List<AActors> actors = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            switch (random.nextInt(0, 3)) {
                case 0 -> actors.add(new bee((i + 1) + " " + "Guido"));
                case 1 -> actors.add(new ant((i + 1) + " " + "Bruno"));
                case 2 -> actors.add(new wolf((i + 1) + " " + "Mattia"));
            }
        }
        return actors;
    }
}
