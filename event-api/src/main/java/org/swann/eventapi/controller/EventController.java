package org.swann.eventapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.swann.eventapi.dto.request.CreateEventRequestDto;
import org.swann.eventapi.service.EventService;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/events")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping
    public ResponseEntity<?> getAllEvents() {
        return ResponseEntity.ok(eventService.getAllEvents());
    }

    @GetMapping("/{slug}")
    public ResponseEntity<?> getEventBySlug(String slug) {
        return ResponseEntity.ok(eventService.getEventBySlug(slug));
    }

    @PostMapping
    public ResponseEntity<?> createEvent(@RequestBody CreateEventRequestDto createEventRequestDto) {
        return ResponseEntity.ok(eventService.createEvent(createEventRequestDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateEvent(@PathVariable UUID id, @RequestBody CreateEventRequestDto createEventRequestDto) {
        return ResponseEntity.ok(eventService.updateEvent(id, createEventRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEvent(@PathVariable UUID id) {
        return ResponseEntity.ok(eventService.deleteEvent(id));
    }
}
