package com.ironhack.labjavamodelingcomplexrelationships.service;

import com.ironhack.labjavamodelingcomplexrelationships.model.users.Guest;
import com.ironhack.labjavamodelingcomplexrelationships.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    @Autowired
    private GuestRepository guestRepository;

    public List<Guest> getAllGuests() { return guestRepository.findAll(); }
    public Guest addNewGuest(Guest guest) { return guestRepository.save(guest); }
}
