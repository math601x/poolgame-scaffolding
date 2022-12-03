package com.example.pool;

import java.util.HashMap;

enum EightBallTypes {
  STRIPED,
  WHOLE,
  BLACK,
}

public class Poolgame {
  private HashMap<Integer, EightBallTypes> RemainingEightBalls = new HashMap<Integer, EightBallTypes>();
  private PlayerType currentPlayerInTurn;
  private Player playerOne, playerTwo;

  public Poolgame(Player playerOne, Player playerTwo) {
    this.playerOne = playerOne;
    this.playerTwo = playerTwo;

    RemainingEightBalls.put(1, EightBallTypes.STRIPED);
    // TODO setup the rest of the game... You can be fancy and fill in the
    // eightballtypes by making a "for" loop

  }

  public void setCurrentPlayerInTurn(PlayerType playerType) {
    this.currentPlayerInTurn = playerType;
  }

  public PlayerType getCurrentPlayerIntTurn() {
    return currentPlayerInTurn;
  }

  // TODO implement (maybe find a better name for this method)
  public void potUntilFail(Player currentPlayerInTurn) {
    // player.pot until a ball unsuccessfully falls into a hole or an opponent
    // eightBallType falls into a hole
  }

  // TODO implement
  public void switchPlayerInTurn() {

  }

  // TODO implement
  public String getWinner() {
    return null;
  }
}
