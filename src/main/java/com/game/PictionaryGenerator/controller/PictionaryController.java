package com.game.PictionaryGenerator.controller;

import com.game.PictionaryGenerator.model.Game;
import com.game.PictionaryGenerator.model.Topic;
import com.game.PictionaryGenerator.repository.GameRepository;
import com.game.PictionaryGenerator.util.GenerateID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
public class PictionaryController {

    @Autowired
    GameRepository gameRepository;

    @GetMapping("/getGames")
    public String games(Model model){
        model.addAttribute("games", gameRepository.findAll());
        return "games";
    }

    @GetMapping("/getGameDetails/{id}")
    public String gameDetails(@PathVariable(value = "id") long id, Model model){
        model.addAttribute("game", gameRepository.findById(id));
        return "details";
    }

    @GetMapping("/createGame")
    public String createGame(Game game, Model m){
        List<Topic> topics = new ArrayList<>();
        m.addAttribute("topicList", topics);
        return "create";
    }

    @PostMapping("/saveGame")
    public String createGame(@ModelAttribute("game") @Valid Game newGame, BindingResult result, Model m){
        long id = GenerateID.getID();
        newGame.setId(id);
        gameRepository.save(newGame);
        return "redirect:/getGameDetails/" + id;
    }

    @RequestMapping(value="/saveGame", params = {"addTopic"})
    public String addTopic(Game game, BindingResult result){
        game.getTopics().add(new Topic());
        return "create";
    }

    @GetMapping("/deleteGame/{id}")
    public String deleteGame(@PathVariable(value = "id") long id, Model model) {
        Game game = gameRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Game not found"));
        gameRepository.delete(game);
        return "redirect:/getGames";
    }
}
