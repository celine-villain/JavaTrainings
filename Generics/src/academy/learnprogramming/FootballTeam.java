package academy.learnprogramming;

public class FootballTeam<T extends Player> extends Team {
    public FootballTeam(String name) {
        super(name);
    }
}
