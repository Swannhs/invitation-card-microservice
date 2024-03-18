package org.swann.eventapi.service;

import org.swann.eventapi.dto.request.CreateEventRequestDto;
import org.swann.eventapi.dto.response.DeletedResponseDto;
import org.swann.eventapi.dto.response.MultiEventsResponseDto;
import org.swann.eventapi.dto.response.SingleEventResponseDto;

import java.util.List;
import java.util.UUID;

public interface EventService {
    SingleEventResponseDto createEvent(CreateEventRequestDto createEventRequestDto);
    SingleEventResponseDto updateEvent(UUID id, CreateEventRequestDto createEventRequestDto);
    SingleEventResponseDto getEventBySlug(String slug);
    List<MultiEventsResponseDto> getAllEvents();
    DeletedResponseDto deleteEvent(UUID id);
}
