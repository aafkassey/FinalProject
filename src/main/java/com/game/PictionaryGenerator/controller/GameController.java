package com.game.PictionaryGenerator.controller;

import com.game.PictionaryGenerator.model.Game;
import com.game.PictionaryGenerator.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @GetMapping("/games")
    public Iterable<Game> getAllGames(){
        return gameRepository.findAll();
    }
}
