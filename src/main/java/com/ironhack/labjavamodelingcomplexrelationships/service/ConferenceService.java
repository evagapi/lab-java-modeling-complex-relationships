package com.ironhack.labjavamodelingcomplexrelationships.service;

import com.ironhack.labjavamodelingcomplexrelationships.model.events.Conference;
import com.ironhack.labjavamodelingcomplexrelationships.repository.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceService {
    @Autowired
    private ConferenceRepository conferenceRepository;

    public List<Conference> getAllConferences() { return conferenceRepository.findAll(); }
    public Conference addNewConference(Conference conference) { return conferenceRepository.save(conference); }
}
