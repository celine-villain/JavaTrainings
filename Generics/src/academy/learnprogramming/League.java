package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> league = new ArrayList<T>();

    //constructor
    public League(String name) {
        this.name = name;
    }

    public boolean addTeam (T team) {
        if (this.league.contains(team)){
            System.out.println(team.getName() + " is already in the league");
            return false;
        } else {
            this.league.add(team);
            return true;
        }
    }

    public void printListOfTeams () {
        Collections.sort(league);
        for (T team : league) {
            System.out.println(team.getName() + " : " + team.ranking());
        }
    }

    //getters & setters
    public String getName() {
        return name;
    }

    public ArrayList<T> getLeague() {
        return league;
    }

    public void setName(String name) {
        this.name = name;
    }
}
