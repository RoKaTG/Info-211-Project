package environment;

import java.util.ArrayList;

import gameCommons.Case;
import gameCommons.Game;
import gameCommons.IEnvironment;
import gameCommons.IFrog;
import environment.Bird;

public class Environment implements IEnvironment {
    private Game game;
    private ArrayList<Lane> lanes;
    private ArrayList<Bird> birds;

    public Environment (Game game) {
        this.game = game;
        lanes = new ArrayList<Lane>();
        birds = new ArrayList<Bird>();
        for (int i = 0; i<game.height; i++) {
            boolean isEmpty;
            isEmpty = (game.randomGen.nextDouble() < 0.2) || i <= 2 || i == game.height - 1;
            lanes.add(new Lane(this.game, i, isEmpty));
        }

    }


}
