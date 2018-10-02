class Teamdetails {
	private String teamname;
	private int wins;
	private int losses;
	private int draws;
	Teamdetails(String teamname1, int wins1, int losses1, int draws1) {
		this.teamname = teamname1;
		this.wins = wins1;
		this.losses = losses1;
		this.draws = draws1;
	}
	public String getTeam() {
		return this.teamname;
	}
	public int getWins() {
		return this.wins;
	}
	public int getLosses() {
		return this.losses;
	}
	public int getDraws() {
		return this.draws;
	}
}