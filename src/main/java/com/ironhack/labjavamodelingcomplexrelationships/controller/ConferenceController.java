package com.ironhack.labjavamodelingcomplexrelationships.controller;

import com.ironhack.labjavamodelingcomplexrelationships.model.events.Conference;
import com.ironhack.labjavamodelingcomplexrelationships.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConferenceController {
    @Autowired
    private ConferenceService conferenceService;

    @GetMapping("/conferences")
    public List<Conference> getAllConferences() { return conferenceService.getAllConferences(); }
    @PostMapping("/conferences")
    public Conference addNewConference(@RequestBody Conference conference) { return conferenceService.addNewConference(conference); }
}
