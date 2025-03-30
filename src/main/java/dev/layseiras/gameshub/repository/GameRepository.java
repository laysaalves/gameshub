package dev.layseiras.gameshub.repository;

import dev.layseiras.gameshub.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
