package com.example.demo.repo;

import com.example.demo.Player;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlayerRespository extends ReactiveMongoRepository<Player, String> {
}
