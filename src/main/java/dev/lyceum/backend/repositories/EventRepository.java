package dev.lyceum.backend.repositories;

import dev.lyceum.backend.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
