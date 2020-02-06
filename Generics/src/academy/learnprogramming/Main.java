package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footLeague = new League<>("AFL");
		League<Team<BaseballPlayer>> baseLeague = new League<>("Base");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Howthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(fremantle,2,1);

        footLeague.addTeam(adelaideCrows);
        footLeague.addTeam(melbourne);
        footLeague.addTeam(hawthorn);
        footLeague.addTeam(fremantle);
        baseLeague.addTeam(baseballTeam);

//        footLeague.addTeam(baseballTeam);
		footLeague.printListOfTeams();
		baseLeague.printListOfTeams();

		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Beckham");
		Team rawTeam = new Team ("Raw");
		rawTeam.addPlayer(beckham);
		rawTeam.addPlayer(pat);

		footLeague.addTeam(rawTeam);

		League<Team> rawLeague = new League ("Really raw");
		rawLeague.addTeam(adelaideCrows);
		rawLeague.addTeam(baseballTeam);
		rawLeague.addTeam(rawTeam);

		League<Team> reallyRaw = new League ("Really Raw");
		reallyRaw.addTeam(adelaideCrows);
		reallyRaw.addTeam(baseballTeam);
		reallyRaw.addTeam(rawTeam);
    }
}
