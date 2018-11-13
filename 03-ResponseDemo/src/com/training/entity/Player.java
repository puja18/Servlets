package com.training.entity;

public class Player {
	int playerId;
	String playerName;
	int noOfMatches;
	int totalRunsScored;
	int noOfWickets;
	boolean captain;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public int getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	public boolean isCaptain() {
		return captain;
	}
	public void setCaptain(boolean captain) {
		this.captain = captain;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName
				+ ", noOfMatches=" + noOfMatches + ", totalRunsScored="
				+ totalRunsScored + ", noOfWickets=" + noOfWickets
				+ ", captain=" + captain + "]";
	}
	public String getBattingRating() {
		double average = this.totalRunsScored/this.noOfMatches;
		if(average >90) {
			return "best";
		}else if(average >=50) {
			return "good";
			
		}else if(average >= 25) {
			return "average";
			
		} else {
			return "poor";
		}
	}
	 public String getBoulingRating() {
		double average = this.noOfWickets/this.noOfMatches;
		if(average >90) {
			return "best";
		}else if(average >=50) {
			return "good";
			
		}else if(average >= 25) {
			return "average";
			
		} else {
			return "poor";
		}
	}

	public Player(int playerId, String playerName, int noOfMatches,
			int totalRunsScored, int noOfWickets, boolean captain) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.noOfMatches = noOfMatches;
		this.totalRunsScored = totalRunsScored;
		this.noOfWickets = noOfWickets;
		this.captain = captain;
	}
	public Player() {
		super();
	}
	
}
