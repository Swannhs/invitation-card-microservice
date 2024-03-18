package org.swann.eventapi.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.swann.eventapi.dto.request.CreateEventRequestDto;
import org.swann.eventapi.dto.response.DeletedResponseDto;
import org.swann.eventapi.dto.response.MultiEventsResponseDto;
import org.swann.eventapi.dto.response.SingleEventResponseDto;
import org.swann.eventapi.model.Event;
import org.swann.eventapi.repository.EventRepository;
import org.swann.eventapi.service.EventService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {
    private final ModelMapper modelMapper;
    private final EventRepository eventRepository;

    @Override
    public SingleEventResponseDto createEvent(CreateEventRequestDto createEventRequestDto) {
        Event event = modelMapper.map(createEventRequestDto, Event.class);
        return modelMapper.map(eventRepository.save(event), SingleEventResponseDto.class);
    }

    @Override
    public SingleEventResponseDto updateEvent(UUID id, CreateEventRequestDto createEventRequestDto) {
        Event event = eventRepository.findById(id).orElseThrow();
        modelMapper.map(createEventRequestDto, event);
        return modelMapper.map(eventRepository.save(event), SingleEventResponseDto.class);
    }

    @Override
    public SingleEventResponseDto getEventBySlug(String slug) {
        return modelMapper.map(eventRepository.getEventBySlug(slug), SingleEventResponseDto.class);
    }

    @Override
    public List<MultiEventsResponseDto> getAllEvents() {
        List<Event> events = eventRepository.findAll();
        return events.stream()
                .map(event -> modelMapper.map(event, MultiEventsResponseDto.class))
                .toList();
    }

    @Override
    public DeletedResponseDto deleteEvent(UUID id) {
        eventRepository.deleteById(id);
        return new DeletedResponseDto("Event deleted successfully");
    }
}
