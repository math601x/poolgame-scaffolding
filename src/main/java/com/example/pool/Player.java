package com.example.pool;

import java.util.HashMap;

enum PlayerType {
  WHOLECOLORPLAYER,
  STRIPEDCOLORPLAYER
}

public class Player {
  private String name;
  private PlayerType playerType;
  private EightBallTypes eightBallTypeSelected;
  private Integer Score;

  public Player(String name) {
    this.name = name;
    this.playerType = playerType;
  }

  public void setPlayerType(PlayerType playerType) {
    this.playerType = playerType;
  }

  public void setEightBallTypeSelected(EightBallTypes eightBallType) {
    this.eightBallTypeSelected = eightBallType;
  }

  public EightBallTypes getEightBallTypeSelected() {
    return eightBallTypeSelected;
  }

  // TODO implement
  public int[] tryBreak(HashMap<Integer, EightBallTypes> remainingEightBalls) {
    // randomly return number of eightballs that successfully went into a hole. The
    // first in the array decides the selected type for the player.
    return null;
  }

  // TODO implement
  public int[] tryPot(EightBallTypes eightBallType, HashMap<Integer, EightBallTypes> remainingEightBalls) {
    // There could be a minor chance of potting multiple balls
    // Alternatively return true or false randomly
    return null;
  }

  public String getName() {
    return name;
  }

  public PlayerType getPlayerType() {
    return playerType;
  }

  public void SetScore(int newScore) {
    this.Score = newScore;
  }

  public int GetScore() {
    return Score;
  }
}
