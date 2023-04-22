//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        HockeyManager hockeyManager = new HockeyManager();
        hockeyManager.addNewForward("Forward1", 22, 10);
        hockeyManager.addNewForward("Forward2", 24, 8);
        hockeyManager.addNewDefender("Defender1", 26, 50);
        hockeyManager.addNewDefender("Defender2", 1, 70);
        hockeyManager.addNewGoalie("Goalie1", 29, 25);
        hockeyManager.addNewGoalie("Goalie2", 27, 30);
        hockeyManager.PrintNameAndAgeOfTheYoungestPlayer();
    }
}
