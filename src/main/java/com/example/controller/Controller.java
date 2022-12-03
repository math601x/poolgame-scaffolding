package com.example.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pool.Player;
import com.example.pool.Poolgame;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {
  public Poolgame game;

  // TODO figure out a way to return a json response body with more game
  // information
  @RequestMapping(value = "/pool/startAndBreak", method = RequestMethod.POST)
  @ResponseBody
  public String StartGame(@RequestBody String jsonString) throws JsonParseException, IOException {
    JsonNode node = new ObjectMapper().readTree(jsonString);

    Player startingPlayer = new Player(node.get("startingPlayer").get("name").textValue());
    Player otherPlayer = new Player(node.get("otherPlayer").get("name").textValue());

    this.game = new Poolgame(startingPlayer, otherPlayer);

    return "Successfully created poolgame";
  }

  // TODO make controller methods for controlling the rest of the game
}
