package dev.layseiras.gameshub.repository;

import dev.layseiras.gameshub.model.Platform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatformRepository extends JpaRepository<Platform, Long> {
}
