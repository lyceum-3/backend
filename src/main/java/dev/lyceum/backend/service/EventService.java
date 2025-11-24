package dev.lyceum.backend.service;

import dev.lyceum.backend.entities.Event;
import dev.lyceum.backend.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found"));
    }

    public Event updateEvent(Long id, Event newEvent) {
        Event event = getEventById(id);

        event.setDate(newEvent.getDate());
        event.setTime(newEvent.getTime());
        event.setName(newEvent.getName());
        event.setNote(newEvent.getNote());

        return eventRepository.save(event);
    }

    public void delete(Long id) {
        eventRepository.deleteById(id);
    }
}
