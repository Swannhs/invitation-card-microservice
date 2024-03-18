package org.swann.eventapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.swann.eventapi.model.Event;

import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<Event, UUID> {
    Event getEventBySlug(String slug);
}