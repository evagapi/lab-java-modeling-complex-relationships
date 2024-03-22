package com.ironhack.labjavamodelingcomplexrelationships.service;

import com.ironhack.labjavamodelingcomplexrelationships.model.events.Event;
import com.ironhack.labjavamodelingcomplexrelationships.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() { return eventRepository.findAll(); }
    public Event addNewEvent(Event event) { return eventRepository.save(event); }
}
