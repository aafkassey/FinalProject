package com.game.PictionaryGenerator.repository;

import com.game.PictionaryGenerator.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends MongoRepository<Game, Long> {

}
