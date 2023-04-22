//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import players.Defender;
import players.Forward;
import players.Goalie;
import players.Player;

public class HockeyManager {
    private ArrayList<Forward> forwards = new ArrayList();
    private ArrayList<Defender> defenders = new ArrayList();
    private ArrayList<Goalie> goalies = new ArrayList();
    private ArrayList<Player> players = new ArrayList();

    public HockeyManager() {
    }

    public void addNewForward(String name, int age, int goals) {
        Forward forward = new Forward(goals, age, name);
        this.forwards.add(forward);
        this.players.add(forward);
    }

    public void addNewDefender(String name, int age, int hits) {
        Defender defender = new Defender(hits, age, name);
        this.defenders.add(defender);
        this.players.add(defender);
    }

    public void addNewGoalie(String name, int age, int wins) {
        Goalie goalie = new Goalie(wins, age, name);
        this.goalies.add(goalie);
        this.players.add(goalie);
    }

    public void PrintNameAndAgeOfTheYoungestPlayer() {
        Player youngestPlayer = (Player)this.players.get(0);

        for(int i = 1; i < this.players.size(); ++i) {
            if (((Player)this.players.get(i)).getAge() < youngestPlayer.getAge()) {
                youngestPlayer = (Player)this.players.get(i);
            }
        }

        System.out.println("Youngest player is: " + youngestPlayer.getName() + "with age:" + youngestPlayer.getAge());
    }
}
