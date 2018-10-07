public class Team implements Comparable<Team> {
    private String team; //variable to store team name.
    private Integer wins; //variable to store wins.
    private Integer losses; //variable to store losses.
    private Integer draws; //variable to store draws.
    public Team() {

    }
    public Team(String name, Integer win, Integer loss, Integer draw) {
        this.team = name;
        this.wins = win;
        this.losses = loss;
        this.draws = draw;
    }

    public String toString() {
        return this.team;
    }
    public Integer getWins() {
        return this.wins;
    }

    public Integer getLosses() {
        return this.losses;
    }

    public Integer getDraws() {
        return this.draws;
    }
    public int compareTo(Team that) {
        if (this.getWins() > that.getWins()) {
            return 1;
        } else if (this.getWins() < that.getWins()) {
            return -1;
        } else if (this.getLosses() < that.getLosses()) {
            return 1;
        } else if (this.getLosses() > that.getLosses()) {
            return -1;
        } else if (this.getDraws() > that.getDraws()) {
            return 1;
        } else if (this.getDraws() < that.getDraws()) {
            return -1;
        } else {
            return 0;
        }
    }
}